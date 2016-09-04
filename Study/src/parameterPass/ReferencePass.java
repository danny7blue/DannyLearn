package parameterPass;

public class ReferencePass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("Before change, sb = " + sb);
		changeData(sb);
		System.out.println("After change, sb = " + sb);
	}

	private static void changeData(StringBuffer sb) {
		sb = new StringBuffer("Hi ");
		sb.append("World");
	}

}
