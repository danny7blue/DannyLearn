/**
 * 
 */
package designPattern.observer;

/**
 * @author Danny
 *
 */
public class Observer1 implements Observer {

	/* (non-Javadoc)
	 * @see observerDesignPattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}

}
