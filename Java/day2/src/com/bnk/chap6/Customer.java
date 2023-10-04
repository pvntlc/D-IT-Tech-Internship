package com.bnk.chap6;

public class Customer {
	int num;
	String name;
	String phone;

	public void deposit(String accountNum, long money) {
		System.out.println(name + " 고객님이 " + money + "원을 입금하셨습니다.");
	}

	public void withdraw(String accountNum, String pw, long money) {
		System.out.println("인증 성공!");
		System.out.println(name + " 고객님이 " + money + "원을 출금하셨습니다.");
	}

	public static void sm() {
		System.out.println("sm....");
	}
}
