package com.bnk.cms.inheritance;

public class Test {
	public static void main(String[] args) {
		Bus b = new Bus("555-6989",1000000000,45);
		b.drive(80);
		//System.out.println(b);
		
		Vehicle v = b;
		Vehicle v2 = new Vehicle("11-1234", 22323);
		System.out.println();
		System.out.println(v2);
	}

}
 