package com.bnk;

public class Car {
	private String num;
	private int price;

	public Car(String num, int price) {
		super();
		this.num = num;
		this.price = price;
	}

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

}
