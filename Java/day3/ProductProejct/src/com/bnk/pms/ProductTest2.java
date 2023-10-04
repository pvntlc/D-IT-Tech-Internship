package com.bnk.pms;

import com.bnk.pms.excep.DuplicateException;

public class ProductTest2 {
	public static void main(String[] args) throws Exception {
		Product p = new Product("L1223", "VaccumCleaner", 100, 5);
		Product p1 = new TV("T-1003", "SmartTV", 100, 5, 55, "OLED");
		Product p2 = new TV("L10030", "VERY SmartTV", 100, 5, 55, "OLED");
		Product p3 = new TV("L1003", "SmartTV", 100, 5, 555, "OLED");
		Product p6 = new TV("L1003", "SmartTV", 100, 5, 555, "OLED");
		Product p4 = new Refrigerator("T1003", "4Door", 400, 3, 500);
		Product p5 = new Refrigerator("T1003", "3Door", 400, 3, 400);

		IProductMgr instance = ProductMgrImpl.getInstance();
		instance.add(p);
		instance.add(p1);
		instance.add(p2);
		instance.add(p3);
		instance.add(p4);
		instance.add(p5);


		System.out.println("0.모든 상품 보여주기 ============================");
		for (Product pd : instance.search()) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("1.L1003 상품 지우기 ============================");
		instance.deleteProduct("L1003");
		for (Product pd : instance.search()) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("2. L10023 상품 찾기 ============================");
		System.out.println(instance.search("L100212123123223"));
		System.out.println();
		System.out.println("3. Smart 키워드 들어간 상품 찾기 ============================");
		for (Product pd : instance.searchTitle("Smart")) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("4. TV 모두 찾기 ============================");
		for (Product pd : instance.searchTV()) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("5. Refrigerator 모두 찾기 ============================");
		for (Product pd : instance.searchRefrigerator()) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("6. 23인치 이상 TV 모두 찾기 ============================");
		for (Product pd : instance.searchTV(23)) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("7. 499리터 이상 Refrigerator 모두 찾기 ============================");
		for (Product pd : instance.searchRefrigerator(499)) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("8. L1123 상품 가격 10으로 업데이트하기 ============================");
		instance.updatePrice("L1223", 10);
		for (Product pd : instance.search()) {
			System.out.println(pd);
		}
		System.out.println();
		System.out.println("9. 총 금액 구하기 ============================");
		System.out.println(instance.getTotalPrice());
	}

}
