package com.bnk.pms;

public class Refrigerator extends Product {
	private int liter;

	public Refrigerator() {
		super();
	}

	public Refrigerator(String num, String title, int price, int quant, int liter) {
		super(num, title, price, quant);
		this.liter = liter;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Refrigerator [toString()=");
		builder.append(super.toString());
		builder.append(", liter=");
		builder.append(liter);
		builder.append("]");
		return builder.toString();
	}
	
	

}
