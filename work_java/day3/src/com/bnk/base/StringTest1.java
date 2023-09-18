package com.bnk.base;

public class StringTest1 {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;

		String s1 = new String("kim");
		String s2 = new String("kim");
		String s3 = "kim";
		String s4 = "kim";

		if (i == j) {
			System.out.println("i == j");
		}
		if (s1 == s2) {
			System.out.println("s1 == s2");
		}
		if (s4 == s3) {
			System.out.println("s3 == s4");
		}
		if (s1.equals(s4)) {
			System.out.println("s1 == s4");
		}
	}

}
