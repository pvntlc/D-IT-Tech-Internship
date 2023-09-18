package com.bnk.statement;

public class WorkShop1_2 {

	public static void main(String[] args) {
		int[] su = { 45, 80, 68, 19, 34, 55, 27, 63, 38, 7 };
		double maxValue = 0;
		int index = 0;

		float total2 = 0;

		for (int ss : su) {
			total2 += ss;
		}

		double avg = total2 / su.length;

		for (int ss : su) {
			if (Math.abs(avg - ss) > maxValue) {
				maxValue = Math.abs(avg - ss);
				index = ss;
			}
		}

		System.out.printf("%.1f", avg);
		System.out.println(" " + index);

	}

}
