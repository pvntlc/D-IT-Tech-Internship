package com.bnk.di4;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class CustomerDAOImpl implements IUserDAO {
	@Override
	public void add(Customer c) throws SQLException {
		Connection con = DBUtil.getConnection();
		String sql = "INSERT INTO CUSTOMER VALUES(cseq.nextval,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, c.getUsername());
		ps.setString(2, c.getPassword());
		ps.setString(3, c.getConts());
		ps.executeUpdate();

		ps.close();
		con.close();

	}

	@Override
	public boolean login(String id, String pw) throws SQLException {
		boolean result = false;
		Connection con = DBUtil.getConnection();
		String sql = "SELECT USERNAME FROM CUSTOMER WHERE username = ? and password = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			result = true;
		}
		rs.close();
		ps.close();
		con.close();
		return result;
	}

	@Override
	public List<Customer> search() throws SQLException {
		List<Customer> result = new ArrayList<Customer>();
		Connection con = DBUtil.getConnection();
		String sql = "SELECT * FROM CUSTOMER";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		System.out.println(111111);
		
		while (rs.next()) {
			Customer c = new Customer(rs.getInt(1), rs.getString(2), "", rs.getString(4));
			result.add(c);
		}
		
		rs.close();
		ps.close();
		con.close();

		return result;
	}
	
	

	@Override
	public Customer search(int num) throws SQLException {
		Customer result = null;
		Connection con = DBUtil.getConnection();
		String sql = "SELECT * FROM CUSTOMER WHERE CNUM = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, num);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			result = new Customer(rs.getInt(1), rs.getString(2), "", rs.getString(4));
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		
		
	}

}
