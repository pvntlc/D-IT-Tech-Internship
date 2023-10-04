package com.bnk.cms;

public class Test {
	public static void main(String[] args) {
		Bus b = new Bus("555-6989",1000000000,45);
		b.setNum("200-222");
		b.drive(800);
		System.out.println(b);
	}

}
