package com.bnk.service;

import java.sql.SQLException;
import java.util.List;

import com.bnk.model.dto.Phone;

public interface PhoneService {
	void add(Phone p) throws SQLException;

	List<Phone> search() throws SQLException;

	Phone searchPnum(int pnum) throws SQLException;


}
