/**
 * 
 */
package designPattern.proxy;

/**
 * @author Danny
 *
 */
public class Proxy implements Sourceable {
	private Source source;
	public Proxy() {
		super();
		this.source = new Source();
	}

	/* (non-Javadoc)
	 * @see proxyDesignPattern.Sourceable#method()
	 */
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	public void before() {
		System.out.println("before!");
	}
	
	public void after() {
		System.out.println("after!");
	}

}
