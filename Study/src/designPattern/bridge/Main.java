/**
 * 
 */
package designPattern.bridge;

/**
 * @author Danny
 *
 */
public class Main {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月11日 上午10:54:09
	 * @version 
	 */
	public static void main(String[] args) {
		ITV tv = new SonyTV();
		LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
		lrc.setChannelKeyboard(100);
	}

}
