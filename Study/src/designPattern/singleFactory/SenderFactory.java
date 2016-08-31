/**
 * 
 */
package designPattern.singleFactory;

/**
 * @author Danny
 *
 */
public class SenderFactory {
	public Sender produce(String type) {
		if (type.equals("mail")) {
			return new MailSender();
		} else if (type.equals("sms")) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型");
			return null;
		}
	}
}
