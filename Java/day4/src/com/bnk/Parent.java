package com.bnk;

public class Parent {
	int k = 5;

	public Parent() {
		System.out.println("Parent Constructor!");
	}

	public void p() {
		System.out.println("Parent pppp");
	}

	public void m() {
		System.out.println("Parent mmmmm");
	}
}

class Child extends Parent {
	int k = 10;

	public Child() {
		// super(); 사실 이거 작성하지 않아도 자동으로 실행됨.
		System.out.println("Child Constructor!");
	}

	public void c() {
		System.out.println("Child cccc");
	}

	public void m() {
		System.out.println("Child mmmm");
	}

}
