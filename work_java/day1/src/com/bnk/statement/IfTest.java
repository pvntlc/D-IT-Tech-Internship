package com.bnk.statement;

import java.util.Scanner;

/*
 * 2023.08.28
 */

public class IfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); //
		
		if(score>100 || score <0) {
			System.out.println("잘못 입력되었습니다.");
		}
		else if (score >= 90) {
			System.out.println("A학점입니다.");
		}
		else if(score >= 80) {
			System.out.println("B학점입니다.");
		}
		else if(score >= 70) {
			System.out.println("C학점입니다.");
		}
		else {
			System.out.println("F학점입니다.");
		}
		
		System.out.println();
		
	}

}
