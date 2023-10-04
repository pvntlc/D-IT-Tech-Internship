package com.bnk;

abstract class Parent {
	public abstract void m();
}

public class NestedTest {
	
	static class Child extends Parent {

		@Override
		public void m() {
			System.out.println("mmmmmmmmmmmm");
		}

	}

	public static void main(String[] args) {
//		
//		Parent p = new Child();
//		p.m();
		
		//Anonyous Nested Class
		Parent p2 = new Parent() {public void m() {
			System.out.println("dddd");};
		};
		
		p2.m();

	}//end main

}//end class 
