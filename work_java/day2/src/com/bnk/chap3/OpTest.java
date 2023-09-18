package com.bnk.chap3;

public class OpTest {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		++x;
		y++;
		System.out.println(x);
		System.out.println(y);

		System.out.println("==============");

		int a = ++x; // 연산장치로 직접적으로 가지 않기 때문에 이게 더 빠르다.
		int b = y++;
		System.out.println(a);
		System.out.println(b); 

	}

}
