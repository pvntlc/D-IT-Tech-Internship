package com.bnk.di1;

public class MyServiceImpl implements IMyService {
	IMyDAO dao;
	
	public MyServiceImpl(IMyDAO dao) {
		this.dao = dao;
		dao.add();
	}
	
	@Override
	public void save() {
		System.out.println("MyServiceImpl의 save()메소드 !");
		dao.add();
	}
	@Override
	public void list() {
		System.out.println("MyServiceImpl의 list()메소드 !");
		dao.search();
	}

}
