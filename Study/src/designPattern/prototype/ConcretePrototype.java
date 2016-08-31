/**
 * 
 */
package designPattern.prototype;

import java.io.Serializable;

/**
 * @author Danny
 *
 */
public class ConcretePrototype extends PrototypeDemo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Student stu = new Student();
	public void show() {
		System.out.println("原型模式实现类");
		System.out.println(this);
		System.out.println(stu);
	}
}
