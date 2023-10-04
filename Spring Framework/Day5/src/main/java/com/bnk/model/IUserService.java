package com.bnk.model;

import java.sql.SQLException;
import java.util.List;

import com.bnk.dto.Customer;

public interface IUserService {

	void save(Customer c) throws SQLException;

	boolean login(String userName, String pw) throws SQLException;

	List<Customer> search(String word) throws SQLException;

	Customer search(int num) throws SQLException;

	void delete(int cnum) throws SQLException;

	void update(Customer c) throws SQLException;
}