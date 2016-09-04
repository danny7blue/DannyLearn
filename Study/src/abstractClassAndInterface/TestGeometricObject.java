/**
 * 
 */
package abstractClassAndInterface;

import java.util.Arrays;

/**
 * @author Danny
 *
 */
public class TestGeometricObject {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年9月1日 下午3:02:38
	 * @param 
	 */
	public static void main(String[] args) {
		Circle circle = new Circle(5, "red", true);
		System.out.println(circle);
		System.out.println(circle.getArea());
		Rectangle rect = new Rectangle(3, 4, "blue", false);
		System.out.println(rect);
		System.out.println(rect.getArea());
		System.out.println(circle.equals(rect));
		
		System.out.println(equalArea(circle, rect));
		
		GeometricObject object1 = new Circle(2);
		GeometricObject object2 = new Rectangle(2,4);
		System.out.println(object1.getArea());
		System.out.println(object2.getArea());
		
		GeometricObject[] objects = {new Circle(5), new Rectangle(2,4), new Circle(1), new Rectangle(1,2)};
		Arrays.sort(objects);
		for (GeometricObject geometricObject : objects) {
			System.out.println(geometricObject);
		}
		
		System.out.println(circle.compareTo(rect));
	}
	
	private static boolean equalArea(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

}
