package spring.aop.helloworld;

public class Main {
	public static void main(String[] args) {
//		ArithmaticCalculator calculator = null;
//		calculator = new ArithmaticCalculatorLoggingImpl();
		
		ArithmaticCalculator target = new ArithmaticCalculatorImpl();
		ArithmaticCalculator proxy = new ArithmaticCalculatorLoggingProxy(target).getLoggingProxy();
		
		int result = proxy.add(1,2);
		System.out.println("-->" + result);
		
		result = proxy.div(4,2);
		System.out.println("-->" + result);
		
	}
}
