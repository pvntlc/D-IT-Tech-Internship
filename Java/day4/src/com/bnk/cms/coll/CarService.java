package com.bnk.cms.coll;

import java.util.ArrayList;
import java.util.List;

public class CarService implements ICarService {
	// Vehicle[] cars = new Vehicle[50];
	// int index = 0;

	private List<Vehicle> cars = new ArrayList<>();
	private static ICarService cs = new CarService();

	private CarService() {

	}

	public static ICarService getInstance() {
		return cs;
	}

	// 등록 메소드
	@Override
	public void add(Vehicle c) {
		cars.add(c);
	}

	@Override
	public Vehicle search(String num) {
		for (Vehicle v : cars) {
			if (v.getNum().equals(num)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public List<Vehicle> search() {
		return cars;
	}

	@Override
	public List<Bus> searchBus() {
		List<Bus> result = new ArrayList<>();
		for (Vehicle v : cars) {
			if (v instanceof Bus) {
				result.add((Bus) v);
			}
		}
		return result;
	}

}
