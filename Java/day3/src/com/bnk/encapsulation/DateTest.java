package com.bnk.encapsulation;

public class DateTest {
	public static void main(String[] args) {
		MyDate today = new MyDate();
		
		today.setDay(1);
		today.setMonth(2);
		today.setYear(2023);
		System.out.println(today.getDay());
		System.out.println(today.toString());
	}
}
