package com.bnk.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDAO dao;
	
	@Override
	public void save(Customer c) throws SQLException {
		dao.add(c);
	}
	
	@Override
	public boolean login(String userName, String pw) throws SQLException {
		return dao.login(userName, pw);
	}
	@Override
	public List<Customer> search() throws SQLException {
		return dao.search();
	}
	
	@Override
	public Customer search(int num) throws SQLException{
		return dao.search(num);
	}
	
	public void delete(int cnum) throws SQLException{
		dao.delete(cnum);
	}
	
	public void update(String conts, String imgInfo, int cnum) throws SQLException{
		dao.update(conts,imgInfo, cnum);
	}
	


}
