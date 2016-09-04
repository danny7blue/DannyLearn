/**
 * 
 */
package test;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Danny
 *
 */
public class TempTest {

	/**
	 * @description 
	 * @author Danny
	 * @date 2016年8月29日 上午10:59:52
	 * @param 
	 */
	public static void main(String[] args) {
//		int[] myList = new int[10];
//		Scanner input = new java.util.Scanner(System.in);
//		System.out.print("Enter " + myList.length + " values: ");
//		for (int i = 0; i < myList.length; i++) {
//			myList[i] = input.nextInt();
//		}
//		for (int i = 0; i < myList.length; i++) {
//			System.out.println(myList[i]);
//		}
		List list = new LinkedList<String>();
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Hello");
		list.add("yuk");
		list.add("you");
//		for (String string : set) {
//			System.out.println(string);
//		}
		for (Object string : list) {
			System.out.println(string);
		}
		Collections.sort(list);
		for (Object string : list) {
			System.out.println(string);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void testThrow() {
		File file = new File("test");
	}
}
