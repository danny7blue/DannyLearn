/**
 * 
 */
package designPattern.bridge;

/**
 * @author Danny
 *
 */
public class SamsungTV implements ITV {

	/* (non-Javadoc)
	 * @see bridgeDesignPattern.ITV#on()
	 */
	@Override
	public void on() {
		System.out.println("Samsung is turned on!");
	}

	/* (non-Javadoc)
	 * @see bridgeDesignPattern.ITV#off()
	 */
	@Override
	public void off() {
		System.out.println("Samsung is turned off!");
	}

	/* (non-Javadoc)
	 * @see bridgeDesignPattern.ITV#switchChannel(int)
	 */
	@Override
	public void switchChannel(int channel) {
		System.out.println("Samsung: channel - " + channel);
	}

}
