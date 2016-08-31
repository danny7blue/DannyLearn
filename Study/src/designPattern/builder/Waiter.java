/**
 * 
 */
package designPattern.builder;

/**
 * @author Danny
 *
 */
public class Waiter {
	private StarbucksBuilder starbucksBuilder;

	public StarBucks getStarbucks() {
		return starbucksBuilder.getStarBucks();
	}

	public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
		this.starbucksBuilder = starbucksBuilder;
	}
	
	public void constructStarBucks() {
		starbucksBuilder.creatStarBucks();
		starbucksBuilder.buildDrink();
		starbucksBuilder.buildSize();
	}
	
}
