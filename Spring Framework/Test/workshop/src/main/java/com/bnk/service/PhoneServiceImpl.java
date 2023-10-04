package com.bnk.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnk.model.dto.Phone;
import com.bnk.model.mapper.PhoneDAOMapper;

@Service
public class PhoneServiceImpl implements PhoneService {
	@Autowired
	PhoneDAOMapper dao;
	@Override
	public void add(Phone p) throws SQLException {
		// TODO Auto-generated method stub
		dao.add(p);
	}

	@Override
	public List<Phone> search() throws SQLException {
		// TODO Auto-generated method stub
		return dao.search();
	}

	@Override
	public Phone searchPnum(int pnum) throws SQLException {
		// TODO Auto-generated method stub
		return dao.searchPnum(pnum);
	}

}
