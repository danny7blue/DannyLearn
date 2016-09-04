package designPattern.bridge.giftDemo;

public class Test {
	public static void main(String[] args) {
		Box box = new RedBox();
		Goods goods = new Watch(box);
		goods.setType();
	}
}
