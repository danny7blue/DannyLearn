/**
 * 
 */
package designPattern.adapter.interfaceAdapter;

/**
 * @author Danny
 *
 */
public abstract class Wrapper implements Sourceable {

	@Override
	public void method1() {
		System.out.println("Wrapper's method1");
	}

	@Override
	public void method2() {
		System.out.println("Wrapper's method2");
	}

}
