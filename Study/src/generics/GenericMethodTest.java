package generics;

public class GenericMethodTest {
	public static <Y> void printArray(Y[] inputArray) {
		for (Y element : inputArray) {
			System.out.print(" " + element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("整形数组元素为： ");
		printArray(intArray);
		
		System.out.println("双精度数组元素为： ");
		printArray(doubleArray);
		
		System.out.println("字符型数组元素为： ");
		printArray(charArray);
	}
}
