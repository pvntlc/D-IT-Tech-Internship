package com.bnk.cms.inheritance;

public interface ICarService {

	int COUNT = 50; // 자동으로 상수 취급됨.
	// public static final int COUNT = 50;

	// 등록 메소드
	// public abstract void add(com.bnk.cms.inheritance.Vehicle args0);
	void add(Vehicle c);

	Vehicle search(String num);

	Vehicle[] search();

	Bus[] searchBus();

	default void work() {
		System.out.println("일하는중");
	}

	static void work2() {
		System.out.println("@22");
	}

}