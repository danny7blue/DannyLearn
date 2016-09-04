package clone;

public class CloneTest {
	public static void main(String[] args) {
		try {
			Person p1 = new Person("Danny", 32, new Car("Audi", 200));
			Person p2 = MyUtil.clone(p1);
			Person p3 = (Person) p1.clone();
			p2.getCar().setBrand("BMW");
			System.out.println(p1 + " " + p1.getClass());
			System.out.println(p2);
			System.out.println(p3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}