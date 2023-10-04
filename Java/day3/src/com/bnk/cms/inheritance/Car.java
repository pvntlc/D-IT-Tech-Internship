package com.bnk.cms.inheritance;

public class Car extends Vehicle{
	private int cc;

	public Car() {}

	public Car(String num, int cc, int price) {
		super(num, price);
//		setNum(num);
//		setPrice(price);
		this.cc = cc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [num=");
		builder.append(getNum());
		builder.append(", cc=");
		builder.append(cc);
		builder.append(", price=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}


	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	

}
