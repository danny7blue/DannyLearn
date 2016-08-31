/**
 * 
 */
package designPattern.prototype;

import java.io.Serializable;

/**
 * @author Danny
 *
 */
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	
	/**
	 * 
	 */
	public Student() {
		this.age = 20;
		this.name = "Danny";
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
