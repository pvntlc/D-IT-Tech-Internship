package com.bnk.cms.inheritance;

public class Test {
	public static void main(String[] args) {
		Vehicle b = new Bus("555-6989", 1000000000, 45);
		b.drive(80);
		Vehicle v2 = new Car("11-1234", 22323, 23);
		v2.drive(200);
	}

}
