package com.bnk.model;

import java.sql.SQLException;
import java.util.List;

import com.bnk.dto.Customer;

public interface IUserService {

	boolean login(String id, String pw) throws SQLException;
}