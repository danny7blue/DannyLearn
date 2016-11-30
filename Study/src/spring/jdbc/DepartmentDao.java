package spring.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * 不推荐使用JdbcDaoSupport, 而推荐直接使用JdbcTemplate作为Dao类的成员变量
 * @author mrsma
 *
 */

@Repository
public class DepartmentDao extends JdbcDaoSupport{

	@Autowired
	public void setDataSource2(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public Department getDepartmentById(Integer id) {
		String sql = "SELECT id, dept_Name name FROM department WHERE id = ?";
		RowMapper<Department> rowMapper = new BeanPropertyRowMapper<Department>(Department.class);
		Department department = getJdbcTemplate().queryForObject(sql, rowMapper, id);
		return department;
	}
	
}
