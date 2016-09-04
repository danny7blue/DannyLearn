/**
 * 
 */
package abstractClassAndInterface;

/**
 * @author Danny
 *
 */
public class Circle extends GeometricObject implements Comparable<GeometricObject>{
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean isFilled) {
		super(color, isFilled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + "]";
	}
}
