package com.bnk.pms;

public class TV extends Product {
	private int inch;
	private String type;

	public TV() {
		super();
	}

	public TV(String num, String title, int price, int quant, int inch, String type) {
		super(num, title, price, quant);
		this.inch = inch;
		this.type = type;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TV [toString()=");
		builder.append(super.toString());
		builder.append(", inch=");
		builder.append(inch);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
	
	

}
