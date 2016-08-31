/**
 * 
 */
package designPattern.abstractFactory;

/**
 * @author Danny
 *
 */
public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("This is SMS sender!");
	}

}
