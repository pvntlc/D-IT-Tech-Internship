package com.bnk;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();

		System.out.println(p.k);
		System.out.println(c.k);

		Parent p2 = c;
		System.out.println(p2.k);
		p.m();
		c.m();

		c.p();
		p2.m();

		// p2.c(); -> 에러
		Child c2 = (Child) p2;
		c2.c();
	}

}
