package com.bnk.chap6;

public class DateTest {
	public static void main(String[] args) throws ClassNotFoundException {
		MyDate today = new MyDate();
		today.year = 2023;
		today.info();

		MyDate m1 = new MyDate(2023, 9, 28);

		MyDate m2 = new MyDate(9, 29);

		MyDate m3 = new MyDate();
		m3.year = 2023;
		m3.month = 10;
		m3.day = 2;

		m1.info();
		m2.info();
		m3.info();
		
		Class c =Class.forName("MyDate");
		System.out.println(c.toString());
		//1. 메모리 로딩을 한다.
	}
}
