/**
 * 
 */
package designPattern.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Danny
 *
 */
public class DecoratorTest {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年7月11日 上午9:26:00
	 * @version 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}

}
