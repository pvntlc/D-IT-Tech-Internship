package com.bnk.modifer;

public class StaticClass {
	static final int sdata;
	int idata = 5;

	static { // 클래스가 메모리에 올라가자마자 바로 실행, 그 이후로는 실행x
		sdata = 10;
		System.out.println("지금!" + sdata);
	}
	
	
	{ // StaticClass 객체 생성할 때마다 실행. 
		System.out.println("================1");

	}
	
	void m() {
		System.out.println(sdata + " " + idata);
	}
	
	static void sm() { // static 메소드 안에서는 this, super는 사용 불가. static 멤버들만 사용 가능함.
		System.out.println("StaticClass [sdata=" + sdata + "]");
	}
	
	

}
