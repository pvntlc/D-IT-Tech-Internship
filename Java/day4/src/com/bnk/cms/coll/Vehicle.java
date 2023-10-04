package com.bnk.cms.coll;

public abstract class Vehicle {
	private String num;
	private int price;

	public Vehicle() {
		super();
	}

	public Vehicle(String num, int price) {
		super();
		this.num = num;
		this.price = price;
	}

	public abstract void drive(int speed);

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [num=");
		builder.append(num);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
