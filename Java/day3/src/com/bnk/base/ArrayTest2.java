package com.bnk.base;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] su;
		int[] su1[];
		int su2[][];
		
		su = new int[2][3];
		
		su[0][1] = 33;
		su[0][2] = 45;
		su[1][0] = 38;
		
		int su3[][][] = {{{1,2,3},{4,5}}};
		
		for(int[][] ss : su3) {
			for(int[] sss: ss) {
				for(int ssss:sss)
					System.out.print(ssss+" ");
				System.out.println();
			}
			
		}
		
		
	}

}
