package com.bnk.cms.coll;

public class Car extends Vehicle {
	private int cc;

	public Car() {

	}

	public Car(String num, int cc, int price) {
		super(num, price);
//		setNum(num);
//		setPrice(price);
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Car [toString()=" + super.toString() + ", cc=" + cc + "]";
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public void drive(int speed) {
		// TODO Auto-generated method stub
		System.out.println(speed + "km로 달리는 차입니다.");

	}

}
