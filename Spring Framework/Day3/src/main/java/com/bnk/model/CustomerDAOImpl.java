package com.bnk.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class CustomerDAOImpl implements IUserDAO {
	@Autowired
	DataSource ds;
	@Override
	public void add(Customer c) throws SQLException {
		Connection con = ds.getConnection();
		String sql = "INSERT INTO CUSTOMER VALUES(cseq.nextval,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, c.getUsername());
		ps.setString(2, c.getPassword());
		ps.setString(3, c.getConts());
		ps.setString(4, c.getImgInfo());
		ps.executeUpdate();

		ps.close();
		con.close();

	}

	@Override
	public boolean login(String userName, String pw) throws SQLException {
		boolean result = false;
		Connection con = DBUtil.getConnection();
		String sql = "SELECT USERNAME FROM CUSToMER WHERE username = ? and password = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, userName);
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
		String sql = "SELECT * FROM CUSTOMER ORDER BY CNUM";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Customer c = new Customer(rs.getInt(1), rs.getString(2), "", rs.getString(4),rs.getString(5));
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
			result = new Customer(rs.getInt(1), rs.getString(2), "", rs.getString(4),rs.getString(5));
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		
		
	}
	
	public void delete(int cnum) throws SQLException{
		Connection con = DBUtil.getConnection();
		String sql = "DELETE FROM CUSTOMER WHERE CNUM = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, cnum);
		ps.executeQuery();
		ps.close();
		con.close();
	}

	@Override
	public void update(String conts, String imgInfo, int cnum) throws SQLException {
		Connection con = DBUtil.getConnection();
		String sql = "UPDATE CUSTOMER SET CONTS = ?, IMGINFO = ? WHERE CNUM = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, conts);
		ps.setString(2, imgInfo);
		ps.setInt(3, cnum);
		ps.executeUpdate();
		ps.close();
		con.close();
		
	}
	
	
}
