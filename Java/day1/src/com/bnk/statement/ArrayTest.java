package com.bnk.statement;

/*
 * 2023.08.28
 */

public class ArrayTest {
	public static void main(String[] args) {
		//배열 : 여러 개의 데이터를 하나의 이름으로 저장할 수 있는 공간.
		//배열 생성
		int[] su = new int[10];
		int suu[] = new int[10];
		su[0] = 10;
		su[1] = 20;
		
		//생성 및 할당
		//int[] su2 = new int[] {10,20,30,40,50};
		int[] su2 = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<su2.length; i++) {
			sum += su2[i];
		}
		
		System.out.println(sum);
		
		sum = 0;
		for(int ss : su2) {
			sum += ss;
		}
		System.out.println(sum);
	}

}

