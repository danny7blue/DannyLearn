/**
 * 
 */
package designPattern.adapter.objectAdapter;

import designPattern.adapter.objectAdapter.Targetable;

/**
 * @author Danny
 *
 */
public class AdapterTest {
	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
		
	}
}
