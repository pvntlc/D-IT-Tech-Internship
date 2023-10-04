package com.bnk.statement;

import java.util.Scanner;

public class WorkShop1_3 {

	public static void main(String[] args) {
		// Buffer :
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int[] numbers = new int[10];

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			numbers[ch - 48] += 1;
		}

		for (int i = 0; i < 10; i++) {
			if (numbers[i] != 0)
				System.out.println(i + " : " + numbers[i]);
		}

		sc.close();
	}

}
