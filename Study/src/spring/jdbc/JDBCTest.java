package spring.jdbc;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JDBCTest {

	private ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
	private JdbcTemplate jdbcTemplate;
	private EmployeeDao employeeDao;
	private DepartmentDao departmentDao;
	
	{
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		employeeDao = ctx.getBean(EmployeeDao.class);
		departmentDao = ctx.getBean(DepartmentDao.class);
	}
	
	@Test
	public void testDataSource() {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource);
	}
	
	@Test
	public void testDepartmentDao() {
		System.out.println(departmentDao.getDepartmentById(4));
	}
	
	@Test
	public void testEmployeeDao() {
		System.out.println(employeeDao.get(2));
	}
	
	/**
	 * 或者单个列的值, 或做统计查询
	 */
	@Test
	public void testQueryForObject2() {
		String sql = "SELECT count(id) FROM employees";
		long count = jdbcTemplate.queryForObject(sql, Long.class);
		System.out.println(count);
	}
	
	/*
	 * 查到实体类的集合
	 * 注意调用的不是queryForList方法
	 */
	@Test
	public void testQueryForList() {
		String sql = "SELECT id, last_name lastName, email FROM employees WHERE dept_Id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		List<Employee> employees = jdbcTemplate.query(sql, rowMapper, 3);
		
		System.out.println(employees);
	}
	
	/**
	 * 从数据库中获取一条记录, 实际得到对应的一个对象
	 * 注意不是调用queryForObject(String sql, Class<Employee> requiredType, Object... args)
	 * 而需要调用queryForObject(String sql, RowMapper<Employee> rowMapper, Object... args)
	 * 1. 其中的RowMapper指定如何去影射结果集的行, 常用的实现类为BeanPropertyRowMapper
	 * 2. 使用sql中列的别名完成列名和类的属性名的影射. 例如 last_name lastName
	 * 3. 不支持级联属性. JdbcTemplate 到底是一个JDBC的小工具, 而不是ORM框架
	 */
	@Test
	public void testQueryForObject() {
		String sql = "SELECT id, last_name lastName, email FROM employees WHERE id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, 1);
		System.out.println(employee);
	}
	
	/**
	 * 执行批量更新: 批量的INSERT, UPDATE, DELETE
	 * 最后一个参数是Object[]的List类型:因为修改一条记录需要一个Object的数组, 那么多条就需要多个Object数组
	 */
//	@Test
//	public void testBatchUpdate() {
//		String sql = "INSERT INTO employees(id, last_name, email, dept_id) VALUES(?,?,?,?)";
//		List<Object[]> batchArgs = new ArrayList<>();
//		batchArgs.add(new Object[]{6, "AA", "aa@googlemail.com", 2});
//		batchArgs.add(new Object[]{7, "BB", "bb@googlemail.com", 3});
//		batchArgs.add(new Object[]{8, "CC", "cc@googlemail.com", 1});
//		batchArgs.add(new Object[]{9, "DD", "dd@googlemail.com", 4});
//		batchArgs.add(new Object[]{10, "EE", "ee@googlemail.com", 5});
//		jdbcTemplate.batchUpdate(sql, batchArgs);
//	}
	
	/**
	 * 执行INSERT, UPDATE, DELETE
	 */
	@Test
	public void testUpdate() {
		String sql = "UPDATE employees SET last_name = ? WHERE id = ?";
		jdbcTemplate.update(sql, "Danny", 5);
	}

}
