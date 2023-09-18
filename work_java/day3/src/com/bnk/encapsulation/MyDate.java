package com.bnk.encapsulation;

public class MyDate {
	
	private int year;
	private int month;
	private int day;

	MyDate() {
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>2000) {
			this.year = year;
		}
		else {
			System.out.println("입력년도의 범위가 올바르지 않습니다.");
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(0<month && month < 13) {
			this.month = month;
		}
		else {
			System.out.println("입력 월의 범위가 올바르지 않습니다.");
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day > 0 && day < 32) {
			this.day = day;
		}
		else {
			System.out.println("입력 일의 범위가 올바르지 않습니다.");
		}
	}

}
