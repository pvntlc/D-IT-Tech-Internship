package com.bnk.cms.inheritance;

public class CarService extends Object implements ICarService {
	Vehicle[] cars = new Vehicle[50];
	int index = 0;

	// 등록 메소드
	@Override
	public void add(Vehicle c) {
		cars[index++] = c;
		System.out.println(COUNT);
	}

	@Override
	public Vehicle search(String num) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(num)) {
				return cars[i];
			}
		}
		return null;
	}

	@Override
	public Vehicle[] search() {
		Vehicle[] result = new Vehicle[index];
		for (int i = 0; i < index; i++) {
			result[i] = cars[i];
		}
		return result;
	}

	@Override
	public Bus[] searchBus() {
		int cnt = 0;
		for (int i = 0; i < index; i++) {
			if (cars[i] instanceof Bus) { // cars[i]에 Bus 인스턴스가 있는지?
				cnt++;
			}
		}
		Bus[] result = new Bus[cnt];
		cnt = 0;
		for (int i = 0; i < index; i++) {
			if (cars[i] instanceof Bus) { // cars[i]에 Bus 인스턴스가 있는지?
				result[cnt++] = (Bus) cars[i];
			}
		}
		return result;
	}

}
