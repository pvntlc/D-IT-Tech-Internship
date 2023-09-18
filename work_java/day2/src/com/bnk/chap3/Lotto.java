package com.bnk.chap3;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();

		int[] nums = new int[6];
		boolean flag = false;
		int su;
		for (int i = 0; i < 6; i++) {
			do {
				su = r.nextInt(45) + 1;
				flag = false;
				for (int j = 0; j < i; j++) {
					if (su == nums[j]) {
						flag = true;
						break;
					}
				}
			} while (flag);

			nums[i] = su;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(nums[i] + " ");
		}
	}

}




