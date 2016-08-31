/**
 * 
 */
package designPattern.builder;

/**
 * @author Danny
 *
 */
public abstract class StarbucksBuilder {
	protected StarBucks starbucks;
	
	public StarBucks getStarBucks() {
		return starbucks;
	}
	
	public void creatStarBucks() {
		starbucks = new StarBucks();
		System.out.println("a drink is created");
	}
	
	public abstract void buildSize();
	public abstract void buildDrink();
}
