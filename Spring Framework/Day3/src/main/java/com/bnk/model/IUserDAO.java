package com.bnk.model;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {

	void add(Customer c) throws SQLException;

	boolean login(String id, String pw) throws SQLException;

	List<Customer> search() throws SQLException;

	Customer search(int num) throws SQLException;
	
	void delete(int cnum) throws SQLException;


	void update(String conts, String imgInfo, int cnum) throws SQLException;

}