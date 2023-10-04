package com.bnk.model;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bnk.dto.Customer;
import com.bnk.mapper.UserMapper;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UserMapper dao;
	
	@Override
	public void save(Customer c) throws SQLException {
		dao.add(c);
	}
	
	@Override
	public boolean login(String userName, String pw) throws SQLException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userName", userName);
		map.put("password", pw);
		return dao.login(map);
	}
	@Override
	public List<Customer> search(String word) throws SQLException {
		word = (word!=null && word.length()!= 0) ? "%"+word+"%" : null;
		System.out.println(word);
		return dao.search(word);
	}
	
	@Override
	public Customer search(int cnum) throws SQLException{
		return dao.searchCnum(cnum);
	}
	
	public void delete(int cnum) throws SQLException{
		dao.delete(cnum);
	}
	
	public void update(Customer c) throws SQLException{
		dao.update(c);
	}
	


}
