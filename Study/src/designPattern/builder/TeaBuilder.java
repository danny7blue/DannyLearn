/**
 * 
 */
package designPattern.builder;

/**
 * @author Danny
 *
 */
public class TeaBuilder extends StarbucksBuilder{
	public void buildSize() {
		starbucks.setSize("large");
		System.out.println("build large size");
	}

	@Override
	public void buildDrink() {
		starbucks.setDrink("tea");
		System.out.println("build tea");
	}
}
