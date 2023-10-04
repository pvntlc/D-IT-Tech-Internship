package com.bnk.cms;

public class Bus {
	private String num;
	private int price;
	private int seat;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
	
	public Bus() {
		
	}
	
	public Bus(String num, int price, int seat) {
		this.num = num;
		this.price = price;
		this.seat = seat;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bus [num=");
		builder.append(num);
		builder.append(", price=");
		builder.append(price);
		builder.append(", seat=");
		builder.append(seat);
		builder.append("]");
		return builder.toString();
	}

	public void drive(int speed) {
		System.out.println(speed + "km로 운행중입니다.");
	}

}
