package com.bnk.cms;

public class Car {
	String num;
	int cc;
	int price;

	public Car() {}

	public Car(String num, int cc, int price) {
		this.num = num;
		this.cc = cc;
		this.price = price;
	}
	
	public String toString() {
		return num + " " + cc + " " + price;
	}
}
