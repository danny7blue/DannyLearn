/**
 * 
 */
package test;

import java.util.Scanner;

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
		int[] myList = new int[10];
		Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter " + myList.length + " values: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
		}
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
	}
}
