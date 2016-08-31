/**
 * 
 */
package designPattern.abstractFactory;

/**
 * @author Danny
 *
 */
public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
