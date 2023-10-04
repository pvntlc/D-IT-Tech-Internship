package com.bnk.statement;

import java.util.Scanner;

public class WorkShop1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int weight = sc.nextInt();

		int total = weight + 100 - height;

		System.out.println(total);
		if (total > 0) {
			System.out.println("비만입니다.");
		}

		sc.close();

	}

}
