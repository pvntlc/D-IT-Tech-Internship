package com.bnk.di4;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {

	void add(Customer c) throws SQLException;

	boolean login(String id, String pw) throws SQLException;

	List<Customer> search() throws SQLException;

	Customer search(int num) throws SQLException;

}