package com.bnk.cms;

public class CarTest {

	public static void main(String[] args) {

		CarService cs = new CarService();
		cs.add(new Car("2021", 12, 12));
		cs.add(new Car("20221", 1222, 2112));
		cs.add(new Car("20211", 152, 51882));
		cs.add(new Car("20210", 125, 1992));
		cs.add(new Car("202188", 152, 182));
		cs.add(new Car("20219", 162, 152));
		cs.add(new Car("20291", 172, 152));

		System.out.println(cs.search("20221"));
		System.out.println("==================");
		
		Car[] cars = cs.search();
		
		for(Car cc : cars) {
			System.out.println(cc);
		}
	}

}
