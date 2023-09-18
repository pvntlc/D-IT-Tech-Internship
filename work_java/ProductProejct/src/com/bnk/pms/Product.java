package com.bnk.pms;

public class Product {
	private String num;
	private String title;
	private int price;
	private int quant;

	public Product() {
		super();
	}

	public Product(String num, String title, int price) {
		this(num, title, price, 1);
	}

	public Product(String num, String title, int price, int quant) {
		super();
		setNum(num);
		setTitle(title);
		setPrice(price);
		setQuant(quant);
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [num=");
		builder.append(getNum());
		builder.append(", title=");
		builder.append(getTitle());
		builder.append(", price=");
		builder.append(getPrice());
		builder.append(", quant=");
		builder.append(getQuant());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Product) {
			Product p = (Product) obj;
			if (this.getNum().equals(p.getNum()) && this.getTitle().equals(p.getTitle())) {
				result = true;
			}

		}
		return result;
	}

}
