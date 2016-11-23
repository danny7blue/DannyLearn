package spring.beans.collections;

import java.util.List;

import spring.beans.Car;

public class Person {
	private String name;
	private String age;
	
	private List<Car> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
}
