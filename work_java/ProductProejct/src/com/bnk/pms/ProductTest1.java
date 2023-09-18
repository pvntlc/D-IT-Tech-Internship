package com.bnk.pms;

public class ProductTest1 {
	public static void main(String[] args) {
		Product p = new Product("L1223","VaccumCleaner",100, 5);
		Product p1 = new TV("L1003","SmartTV",100, 5, 55,"OLED");
		Product p2 = new TV("L1003","SmartTV",100, 5, 55,"OLED");
		Product p3 = new Refrigerator("T1003","4Door",400, 3,500);
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p3);
		
		System.out.println(p2.equals(p1));
	}
}
