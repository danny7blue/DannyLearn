/**
 * 
 */
package designPattern.observer;

/**
 * @author Danny
 *
 */
public class Observer2 implements Observer {

	/* (non-Javadoc)
	 * @see observerDesignPattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}

}
