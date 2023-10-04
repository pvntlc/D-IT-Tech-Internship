package com.bnk.cms.coll;

import java.util.List;

public class CarTest2 {

	public static void main(String[] args) {

		ICarService cs = CarService.getInstance();
		cs.add(new Car("20212", 12, 12));
		cs.add(new Bus("2021", 1222, 2112));
		cs.add(new Bus("20211", 152, 51882));
		cs.add(new Bus("20210", 125, 1992));
		cs.add(new Car("202188", 152, 182));
		cs.add(new Car("20219", 162, 152));
		cs.add(new Car("20291", 172, 152));

		List<Vehicle> vv = cs.search();
		for (Vehicle v : vv) {
			System.out.println(v);

		}

	}

}
