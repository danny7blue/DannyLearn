package spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法: 实例工厂的方法, 即先需要创建工厂本身, 再调用工厂的实例方法来返回bean的实例
 * @author mrsma
 *
 */
public class InstanceCarFactory {
	private Map<String, Car> cars = null;
	
	public InstanceCarFactory() {
		cars = new HashMap<String, Car>();
		cars.put("Audi", new Car("Audi", 300000));
		cars.put("Ford", new Car("Ford", 400000));
	}
	
	public Car getCar(String brand) {
		return cars.get(brand);
	}
}
