package com.bnk.statement;

/*
 * 2023.08.28
 */

public class ForTest {

	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Hello");
//		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j < 5; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i<5; i++) {
			for(int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
