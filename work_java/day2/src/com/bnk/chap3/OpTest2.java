package com.bnk.chap3;

public class OpTest2 {

	public static void main(String[] args) {
		int x = 5;
		// &이면 앞과 뒤 모두 실행하고, &&이면 앞만 틀려도 실행 안 함.
		if(x >5 & ++x <10) {
			x += 10;
		}
		System.out.println(x);

		int y = (x==5)?5:6;
		System.out.println(y);
	}

}
