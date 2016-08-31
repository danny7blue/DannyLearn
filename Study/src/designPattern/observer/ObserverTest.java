/**
 * 
 */
package designPattern.observer;

/**
 * @author Danny
 *
 */
public class ObserverTest {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月11日 上午11:38:41
	 * @version 
	 */
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}

}
