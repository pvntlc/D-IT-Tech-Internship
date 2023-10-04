package com.bnk.cms;

public class CarService {
	Car[] cars = new Car[50];
	int index = 0;
	

	// 등록 메소드
	public void add(Car c) {
		cars[index++] = c;
	}

	public Car search(String num) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(num)) {
				return cars[i];
			}
		}
		return null;
	}

	public Car[] search() {
		Car[] result = new Car[index];
		for (int i = 0; i < index; i++) {
			result[i] = cars[i];
		}
		return result;
	}

}
