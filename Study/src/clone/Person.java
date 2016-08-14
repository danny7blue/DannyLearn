package clone;

import java.io.Serializable;

public class Person implements Serializable, Cloneable{

	private static final long serialVersionUID = 2995662919016760179L;
	
	private String name;
	private int age;
	private Car car;
	
	public Person(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
