/**
 * 
 */
package designPattern.adapter.objectAdapter;

import designPattern.adapter.objectAdapter.Source;
import designPattern.adapter.objectAdapter.Targetable;

/**
 * @author Danny
 *
 */
public class Wrapper implements Targetable{
	private Source source;
	
	public Wrapper (Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
	
	public void method1() {
		source.method1();
	}
}
