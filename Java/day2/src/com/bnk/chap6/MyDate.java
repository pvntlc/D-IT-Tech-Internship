package com.bnk.chap6;

public class MyDate {
	int year;
	int month;
	int day;

	public void info() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public MyDate(int m, int d) {
		this(2023, m, d);
	}

	// default 생성자 : MyDate 생성자를 따로 생성하지 않으면, 컴파일러가 자동으로 만든다.
	public MyDate() {

	}
}
