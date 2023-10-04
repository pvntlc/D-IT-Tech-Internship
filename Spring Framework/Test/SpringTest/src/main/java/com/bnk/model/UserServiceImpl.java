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
	public boolean login(String id, String pw) throws SQLException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pw", pw);
		return dao.login(map);
	}
	


}
