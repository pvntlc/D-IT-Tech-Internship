package com.bnk.pms.excep;

public class DuplicateException extends Exception {
	public DuplicateException() {
		super("상품이 중복되었습니다.");
	}
}
