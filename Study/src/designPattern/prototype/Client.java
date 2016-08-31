/**
 * 
 */
package designPattern.prototype;

import java.io.IOException;

/**
 * @author Danny
 *
 */
public class Client {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月10日 上午11:51:13
	 * @version 
	 */
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype clonecp = null;
			try {
				/* 深拷贝 */
//				clonecp = (ConcretePrototype) cp.deepClone();
				/* 浅拷贝 */
				clonecp = (ConcretePrototype) cp.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			clonecp.show();
		}
	}

}
