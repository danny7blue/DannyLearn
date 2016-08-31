/**
 * 
 */
package designPattern.singleton;

/**
 * @author Danny
 *
 */
public class Singleton {
	/* 持有私有静态实例, 防止被引用, 此处赋值为null, 目的是实现延迟家宅*/
	private static Singleton instance = null;
	
	/*私有构造方法, 防止被实例化*/
	private Singleton(){
	}
	
	/* 静态工程方法, 创建实例 */
	public static Singleton getInstance() {
		synchronized (instance) {
			if (instance == null)
				instance = new Singleton();
		}
		return instance;
	}
}
