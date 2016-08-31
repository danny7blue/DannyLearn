/**
 * 
 */
package designPattern.decorator;

/**
 * @author Danny
 *
 */
public class DecoratorTest {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月11日 上午9:26:00
	 * @version 
	 */
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}

}
