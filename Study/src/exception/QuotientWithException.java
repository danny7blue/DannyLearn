package exception;

import java.util.Scanner;

public class QuotientWithException {
	public static int quotient(int number1, int number2) {
		if(number2 == 0) {
			throw new ArithmeticException("Divisor cannot be zero");
		}
		return number1 / number2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loopTimes = 0;
		
		do {
			try {
				System.out.println("Enter two integers");
				int number1 = input.nextInt();
				int number2 = input.nextInt();
				System.out.println(quotient(number1, number2));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			input.nextLine();
			loopTimes++;
		} while (loopTimes < 5);
//		finally {
//		}
	}

}
