/**
 * 
 */
package designPattern.facade;

/**
 * @author Danny
 *
 */
public class User {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月11日 上午10:37:35
	 * @version 
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
