package com.bnk.di1;

import org.springframework.stereotype.Repository;

@Repository("Oracle")
public class FaultDAOImpl implements IMyDAO {
	@Override
	public void add() {
		System.out.println("MyDAOImpl add()메소드 호출");
	}

	@Override
	public void search() {
		System.out.println("MyDAOImpl search()메소드 호출");
	}

}
