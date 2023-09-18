package com.bnk.cms.coll;

import java.util.List;

public class CarTest {

	public static void main(String[] args) {

		ICarService cs = CarService.getInstance();
		cs.add(new Car("192-12", 1212, 1882));
		cs.add(new Bus("292-11", 1222, 2112));
		cs.add(new Bus("392-11", 1529, 5188));
		cs.add(new Bus("492-10", 1256, 1992));
		cs.add(new Car("592-18", 1527, 2182));
		cs.add(new Car("692-19", 1626, 6152));
		cs.add(new Car("792-91", 1721, 5152));

		CarTest2.main(new String[] {});

	}

}
