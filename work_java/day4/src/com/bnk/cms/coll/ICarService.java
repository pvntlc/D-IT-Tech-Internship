package com.bnk.cms.coll;

import java.util.List;

public interface ICarService {
	
	int d = 4;

	// 등록 메소드
	// public abstract void add(com.bnk.cms.inheritance.Vehicle args0);
	void add(Vehicle c);

	Vehicle search(String num);

	List<Vehicle> search();

	List<Bus> searchBus();

}