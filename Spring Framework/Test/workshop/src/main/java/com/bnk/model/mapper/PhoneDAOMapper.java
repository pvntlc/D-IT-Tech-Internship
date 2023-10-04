package com.bnk.model.mapper;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.bnk.model.dto.Phone;

@Mapper
public interface PhoneDAOMapper {

	void add(Phone p) throws SQLException;

	List<Phone> search() throws SQLException;

	Phone searchPnum(int pnum) throws SQLException;

}