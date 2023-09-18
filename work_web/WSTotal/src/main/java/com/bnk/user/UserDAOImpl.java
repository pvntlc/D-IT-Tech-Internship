package com.bnk.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bnk.util.DBPool;

public class UserDAOImpl implements UserDAO {
	@Override
	public boolean login(String user, String pw) throws SQLException {
		boolean result = false;
		Connection con = DBPool.getConnection();
		String sql = "SELECT * FROM USERS WHERE EMAIL = ? and password = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			result = true;
		}
		DBPool.release(ps, con);
		return result;
	}

	public void add(String user, String email, String phone, String password) {
		Connection con = DBPool.getConnection();
		String sql = "INSERT INTO USERS VALUES(user_seq.nextval, ?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, email);
			ps.setString(3, phone);
			ps.setString(4, password);
			ps.executeUpdate();
			DBPool.release(ps, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<User> search() {
		Connection con = DBPool.getConnection();
		List<User> result = new ArrayList<>();
		String sql = "Select * from users ORDER BY USEQ";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				result.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public User search(int useq) {
		Connection con = DBPool.getConnection();
		String sql = "Select * from users WHERE USEQ = ?";
		User result = null;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, useq);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public void delete(int useq) {
		Connection con = DBPool.getConnection();
		String sql = "DELETE FROM USERS WHERE USEQ = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, useq);
			ps.executeUpdate();
			DBPool.release(ps, con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(int useq, String name, String email, String phone) {
		Connection con = DBPool.getConnection();
		String sql = "UPDATE USERS SET NAME = ? , EMAIL = ?, PHONE = ? WHERE USEQ = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2,email);
			ps.setString(3, phone);
			ps.setInt(4, useq);
			ps.executeUpdate();
			DBPool.release(ps, con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
