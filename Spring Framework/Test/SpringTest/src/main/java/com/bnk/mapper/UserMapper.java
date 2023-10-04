package com.bnk.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bnk.dto.Customer;

@Mapper
public interface UserMapper {

	boolean login(Map<String, String> map) throws SQLException;

}