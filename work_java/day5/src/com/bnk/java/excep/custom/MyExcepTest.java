package com.bnk.java.excep.custom;

class MyExcepTest {
	public static void main(String[] args) {
		int res = 0;
		MyExcepTest my = new MyExcepTest();
		for (int i = 0; i < 4; i++) {
			try {
				res = my.calc(2, i);
				System.out.println(i + ") res =" + res);
			} catch (ValueExcept e) {
				System.out.println(e);
				e.myMethod();
			}
		}
		System.out.println("End of main body");
	}

	public int calc(int x, int y) throws ValueExcept {
		if (x - y == 0) {
			throw new ValueExcept();
		}
		int result = (x + y) / (x - y);
		return result;
	}
}