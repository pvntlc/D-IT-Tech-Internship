package com.bnk.base;

import java.util.Arrays;

public class StringTest4 {

	public static void main(String[] args) {
		String s1 = "K I a m";
		s1.concat("Lee");
		s1 = s1.replace("i", "a");
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim()); // 양쪽 공백 제거
		System.out.println(s1.indexOf("m"));

		String[] ss = s1.split(" ");
		for (String s : ss)
			System.out.println(s);
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		System.out.println(Week.FRIDAY);



	}

}
