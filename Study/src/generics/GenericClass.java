package generics;

public class GenericClass<T> {
	private T t;
	
	public void set (T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}

	public static void main(String[] args) {
		GenericClass<Integer> integerBox = new GenericClass<Integer>();
		GenericClass<String> stringBox = new GenericClass<String>();

	    integerBox.set(new Integer(10));
	    stringBox.set(new String("菜鸟教程"));

	    System.out.printf("整型值为 :%d\n\n", integerBox.get());
	    System.out.printf("字符串为 :%s\n", stringBox.get());
	}

}
