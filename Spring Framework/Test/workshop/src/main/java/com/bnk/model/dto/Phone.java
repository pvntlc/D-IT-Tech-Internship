package com.bnk.model.dto;

public class Phone {
	private String pnum;
	private String title;
	private int price;
	private int quantity;
	private String pimg;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [pnum=");
		builder.append(pnum);
		builder.append(", title=");
		builder.append(title);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", pimg=");
		builder.append(pimg);
		builder.append("]");
		return builder.toString();
	}
	
	public Phone(String pnum, String title, int price, int quantity, String pimg) {
		super();
		this.pnum = pnum;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
		this.pimg = pimg;
	}
	public Phone() {
		super();
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}

}
