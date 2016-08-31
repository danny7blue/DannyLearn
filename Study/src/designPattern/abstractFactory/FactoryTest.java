/**
 * 
 */
package designPattern.abstractFactory;

/**
 * @author Danny
 *
 */
public class FactoryTest {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月8日 下午5:58:42
	 * @version 
	 */
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	}

}
