package com.bnk.modifer;

import java.util.Arrays;

import com.bnk.cms.*;

public class Test {
	public static void main(String[] args) {
//		Car c = new Car();
//		CarService cs = new CarService();
//		cs.add(c);
//		cs.add(new Car("111-1111",11,111));
//		c.num = "111-111";
//		System.out.println(Arrays.toString(cs.search()));
		StaticClass sc = new StaticClass();
		System.out.println(StaticClass.sdata);
		StaticClass.sm();
		
		StaticClass sc1 = new StaticClass();
		StaticClass sc2 = new StaticClass();
		sc1.idata = 20;
		sc1.m();
		sc2.m();
		StaticClass sc3 = new StaticClass();
		
	}

}
