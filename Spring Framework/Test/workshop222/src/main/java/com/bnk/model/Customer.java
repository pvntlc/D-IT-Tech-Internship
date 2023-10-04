package com.bnk.model;

public class Customer {
	private int cnum;
	private String userName;
	private String password;
	private String conts;
	private String imgInfo;

	public Customer(int cnum, String userName, String password, String conts, String imgInfo) {
		super();
		this.cnum = cnum;
		this.userName = userName;
		this.password = password;
		this.conts = conts;
		this.imgInfo = imgInfo;
	}

	public Customer() {
		super();
	}

	public Customer(int cnum, String username, String password, String conts) {
		super();
		this.cnum = cnum;
		this.userName = username;
		this.password = password;
		this.conts = conts;
	}

	public Customer(String userName, String password, String conts) {
		super();
		this.userName = userName;
		this.password = password;
		this.conts = conts;
	}
	
	public Customer(String userName, String password, String conts, String imgInfo) {
		super();
		this.userName = userName;
		this.password = password;
		this.conts = conts;
		this.imgInfo = imgInfo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getImgInfo() {
		return imgInfo;
	}

	public void setImgInfo(String imgInfo) {
		this.imgInfo = imgInfo;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConts() {
		return conts;
	}

	public void setConts(String conts) {
		this.conts = conts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [cnum=");
		builder.append(cnum);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", conts=");
		builder.append(conts);
		builder.append(", imgInfo=");
		builder.append(imgInfo);
		builder.append("]");
		return builder.toString();
	}



}
