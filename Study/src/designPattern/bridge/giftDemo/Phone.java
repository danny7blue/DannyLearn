package designPattern.bridge.giftDemo;

public class Phone extends Goods{

	public Phone(Box box) {
		super(box);
	}

	@Override
	public void setType() {
		System.out.println("手机使用" + super.getBox().getColor());
	}

}
