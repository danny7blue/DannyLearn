/**
 * 
 */
package designPattern.adapter;

/**
 * @author Danny
 *
 */
public class WrapperTest {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月10日 下午1:45:32
	 * @version 
	 */
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}

}
