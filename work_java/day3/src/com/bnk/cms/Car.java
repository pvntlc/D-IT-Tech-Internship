package com.bnk.cms;

public class Car {
	private String num;
	private int cc;
	private int price;

	public Car() {}

	public Car(String num, int cc, int price) {
		this.num = num;
		this.cc = cc;
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [num=");
		builder.append(num);
		builder.append(", cc=");
		builder.append(cc);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		if(num.length() == 7)
			this.num = num;
		else {
			System.out.println("차량번호 오류");
		}
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
