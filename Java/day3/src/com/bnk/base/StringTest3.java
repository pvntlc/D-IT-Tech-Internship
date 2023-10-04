package com.bnk.base;

public class StringTest3 {

	public static void main(String[] args) {
		String s1 = new String("kim");
		String s2 = s1+"Lee";
		String s3 = "kimLee";
		
		if(s2 == s3) {
			System.out.println("s2 == s3");
		}
		else if(s2.equals(s3)) {
			System.out.println("s2.equals(s3)");
		}
		
		StringBuilder sb = new StringBuilder("dd");
		sb.append("Ddd");
		System.out.println(sb.charAt(2));
		
		
	}

}
