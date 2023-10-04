package com.bnk.cms.inheritance;

public class Vehicle {
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
	
	public void drive(int speed) {
		System.out.println(speed + "km로 운행중입니다.");
	}
	
	
	

}
