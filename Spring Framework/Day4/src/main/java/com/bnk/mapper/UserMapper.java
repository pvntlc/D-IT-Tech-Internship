package com.bnk.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bnk.dto.Customer;

@Mapper
public interface UserMapper {

	void add(Customer c) throws SQLException;

	boolean login(Map<String, String> map) throws SQLException;

	List<Customer> search() throws SQLException;

	Customer searchCnum(int cnum) throws SQLException;
	
	void delete(int cnum) throws SQLException;

	void update(Customer c) throws SQLException;

}