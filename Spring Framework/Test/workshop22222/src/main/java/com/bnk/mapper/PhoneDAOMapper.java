package com.bnk.mapper;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.bnk.dto.Phone;


@Mapper
public interface PhoneDAOMapper {

	void add(Phone p) throws SQLException;

	List<Phone> search() throws SQLException;

	Phone searchPnum(String pnum) throws SQLException;

}