package com.bnk.coll;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> l = new LinkedList<>();

		l.add("Seoul");
		l.add("Seoul3");
		l.add("Seoul2");
		l.add("Seoul");
		l.add("Daegu");

		for (int i = 0; i < 5; i++) {
			System.out.println(l.get(0));
			l.remove(0);
		}
	}
}
