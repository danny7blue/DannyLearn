package designPattern.bridge.giftDemo;

public class Watch extends Goods{

	public Watch(Box box) {
		super(box);
	}

	@Override
	public void setType() {
		System.out.println("手表使用" + super.getBox().getColor());
	}

}
