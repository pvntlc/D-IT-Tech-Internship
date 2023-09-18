package com.bnk.cms.inheritance;

public class CarTest {

	public static void main(String[] args) {

		ICarService cs = new CarService();
		cs.add(new Car("20212", 12, 12));
		cs.add(new Bus("2021", 1222, 2112));
		cs.add(new Bus("20211", 152, 51882));
		cs.add(new Bus("20210", 125, 1992));
		cs.add(new Car("202188", 152, 182));
		cs.add(new Car("20219", 162, 152));
		cs.add(new Car("20291", 172, 152));

		Vehicle vv = cs.search("2021");
		System.out.println(vv);

		for (Vehicle v : cs.search()) {
			System.out.println(v);
		}

		System.out.println("========================");

		for (Bus b : cs.searchBus()) {
			System.out.println(b);
		}

		ICarService.work2();

	}

}
