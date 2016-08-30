/**
 * 
 */
package polymorphism;

/**
 * @author Danny
 *
 */
public class Test {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年8月2日 上午9:57:29
	 * @version 
	 */
	public static void main(String[] args) {
		SuperClass a1 = new SuperClass();
		SuperClass a2 = new ChildA();
		ChildA b = new ChildA();
        ChildB c = new ChildB();
        ChildC d = new ChildC();
        
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
	}

}
