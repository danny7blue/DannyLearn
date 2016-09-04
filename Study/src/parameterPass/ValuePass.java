package parameterPass;

public class ValuePass {

	public static void main(String[] args) {
		int n = 3;
		System.out.println("Before change, n = " + n);
		changeData(n);
		System.out.println("After change, n = " + n);
	}

	private static void changeData(int nn) {
		nn = 5;
	}

}
