package com.bnk.coll;

import java.util.HashMap;
import java.util.Map;
import com.bnk.cms.inheritance.Car;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Car> s = new HashMap<>();
		s.put("101-6989", new Car("101-6989", 10, 10));
		s.put("101-6970", new Car("101-6970", 10, 10));
		s.put("101-6981", new Car("101-6981", 10, 10));

		System.out.println(s);

		for (String key : s.keySet()) {
			System.out.println(s.get(key));
		}

		System.out.println(s.get("101-6989"));
	}
}
