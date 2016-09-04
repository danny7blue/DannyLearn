package designPattern.bridge.giftDemo;

public abstract class Goods {
	private Box box;
	
	public Goods(Box box) {
		this.box = box;
	}
	
	abstract void setType();
	
	public Box getBox() {
		return this.box;
	}
}
