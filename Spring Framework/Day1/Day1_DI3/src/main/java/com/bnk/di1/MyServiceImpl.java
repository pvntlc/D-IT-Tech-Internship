package com.bnk.di1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements IMyService {
	@Autowired
	@Qualifier("ibm")
	IMyDAO dao;

//	@Autowired
//	public void setDao(IMyDAO dao) {
//		this.dao = dao;
//	}
	
//	@Autowired
//	public MyServiceImpl(IMyDAO dao) {
//		this.dao = dao;
//	}


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
