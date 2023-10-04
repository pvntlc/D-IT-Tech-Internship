package com.bnk.cms.inheritance;

public class Bus extends Vehicle {
	private int seat;

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public Bus() {

	}

	public Bus(String num, int price, int seat) {
		super(num, price);
		this.seat = seat;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", seat=");
		builder.append(seat);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void drive(int speed) {
		// TODO Auto-generated method stub
		System.out.println(speed + "로 달리는 버스입니다.");
	}

}
