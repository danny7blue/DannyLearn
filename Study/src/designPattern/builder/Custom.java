/**
 * 
 */
package designPattern.builder;

/**
 * @author Danny
 *
 */
public class Custom {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
		waiter.setStarbucksBuilder(coffeeBuilder);
		waiter.constructStarBucks();
		StarBucks drink = waiter.getStarbucks();
	}
}
