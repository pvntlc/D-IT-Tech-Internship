package com.bnk.java.excep.custom;

class ValueExcept extends Exception {
	ValueExcept() {
		super("ValueException : 값에 오류가 존재합니다.");
	}

	void myMethod() {
		System.out.println("Exception 처리 메소드");
	}
}
