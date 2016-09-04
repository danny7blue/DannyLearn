package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentImplementsComparable implements Comparable<StudentImplementsComparable>{
	private String name;
	private int age;
	
	public StudentImplementsComparable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(StudentImplementsComparable o) {
		return this.age - o.age;
	}
	
	public static void main(String[] args) {
		List<StudentImplementsComparable> list = new ArrayList<StudentImplementsComparable>();
		list.add(new StudentImplementsComparable("Hao LUO", 33));
        list.add(new StudentImplementsComparable("XJ WANG", 32));
        list.add(new StudentImplementsComparable("Bruce LEE", 60));
        list.add(new StudentImplementsComparable("Bob YANG", 22));
        Collections.sort(list);
        
        for (StudentImplementsComparable student : list) {
			System.out.println(student);
		}
	}

}
