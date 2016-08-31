/**
 * 
 */
package designPattern.proxy;

/**
 * @author Danny
 *
 */
public class Source implements Sourceable {

	/* (non-Javadoc)
	 * @see proxyDesignPattern.Sourceable#method()
	 */
	@Override
	public void method() {
		System.out.println("the original method");
	}

}
