/**
 * 
 */
package designPattern.builder;

/**
 * @author Danny
 *
 */
public class CoffeeBuilder extends StarbucksBuilder {

	@Override
	public void buildSize() {
		starbucks.setSize("medium");
		System.out.println("build medium size");
	}

	@Override
	public void buildDrink() {
		starbucks.setDrink("coffee");
		System.out.println("build coffee");
	}
	
}
