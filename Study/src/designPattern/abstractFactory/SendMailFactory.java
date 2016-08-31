/**
 * 
 */
package designPattern.abstractFactory;

/**
 * @author Danny
 *
 */
public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
