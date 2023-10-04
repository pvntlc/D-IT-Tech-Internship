package com.bnk.di1;

public class MyDAOImpl implements IMyDAO {
	@Override
	public void add() {
		System.out.println("MyDAOImpl add()메소드 호출");
	}

	@Override
	public void search() {
		System.out.println("MyDAOImpl search()메소드 호출");
	}

}
