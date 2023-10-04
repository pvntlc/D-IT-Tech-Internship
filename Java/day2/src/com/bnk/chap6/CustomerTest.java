package com.bnk.chap6;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer.sm();
		Customer c = new Customer();
		c.name = "김팡틱";
		c.deposit("111-111-11-11", 110);
		c.withdraw("1111-11-1-1--1-11", "1234", 1231223);
	}

}
