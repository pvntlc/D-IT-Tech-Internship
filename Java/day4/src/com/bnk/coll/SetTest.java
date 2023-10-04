package com.bnk.coll;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		s.add("Seoul");
		s.add("Busan");
		s.add("Ansan");
		s.add("Ansan");
		s.add("Daegu");
		s.add("Incheon");
		for (String ss : s) {
			System.out.println(ss);
		}
		System.out.println(s.size());
	}

}
