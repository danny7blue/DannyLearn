/**
 * 
 */
package designPattern.multiFactory;

/**
 * @author Danny
 *
 */
public class FactoryTest {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月8日 下午5:40:54
	 * @version 
	 */
	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produceMail();
		sender.send();
	}
}
