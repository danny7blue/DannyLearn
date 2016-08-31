/**
 * 
 */
package designPattern.bridge;

/**
 * @author Danny
 *
 */
public class LogitechRemoteControl extends AbstractRemoteControl {

	/**
	 * @param tv
	 */
	public LogitechRemoteControl(ITV tv) {
		super(tv);
	}
	
	public void setChannelKeyboard(int channel){
        setChannel(channel);
        System.out.println("Logitech use keyword to set channel.");
    }

}
