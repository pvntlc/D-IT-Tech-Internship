package com.bnk.model;

import java.sql.SQLException;
import java.util.List;

import com.bnk.dto.Phone;


public interface PhoneService {
	void add(Phone p) throws SQLException;

	List<Phone> search() throws SQLException;

	Phone searchPnum(String pnum) throws SQLException;


}
