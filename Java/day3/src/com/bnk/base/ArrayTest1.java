package com.bnk.base;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] su;
		int su2[];
		
		su = new int[5];
		su[0] = 11;
		su[1] = 22;
		su[2] = 33;
		
		for(int number : su) {
			System.out.println(number);
		}
		
		int[] su3 = new int[5];
		
		int[] su4 = new int[] {1,2,3,4,5};
		int[] su5 = {1,2,3,4,5};

	}

}
