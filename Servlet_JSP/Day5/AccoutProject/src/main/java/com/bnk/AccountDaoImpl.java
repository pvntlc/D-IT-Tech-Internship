package com.bnk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
	@Override
	public void add(AccountDTO account) throws SQLException {
		Connection con = DBPool.getConnection();
		String sql = "insert into ACCOUNT values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, account.getAseq());
		ps.setInt(2, account.getCseq());
		ps.setInt(3, account.getPseq());
		ps.setInt(4, account.getBalance());
		ps.setString(5, account.getPassword());
		ps.executeUpdate();
		DBPool.releaseAuto(ps, con);
	}

	@Override
	public List<AccountDTO> search() throws SQLException {
		List<AccountDTO> result = new ArrayList<AccountDTO>();
		Connection con = DBPool.getConnection();
		String sql = "select * from ACCOUNT order by aseq";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			result.add(new AccountDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
		}
		DBPool.releaseAuto(ps, con);
		return result;
	}

	@Override
	public AccountDTO search(String aseq) throws SQLException {
		AccountDTO result = null;
		Connection con = DBPool.getConnection();
		String sql = "select * from ACCOUNT where aseq = ? order by aseq";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, aseq);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			result = new AccountDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
		}
		DBPool.releaseAuto(ps, con);
		return result;
	}

	@Override
	public void delete(String aseq) throws SQLException {
		Connection con = DBPool.getConnection();
		String sql = "delete from ACCOUNT where aseq = ? order by aseq";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, aseq);
		ps.executeUpdate();
		DBPool.releaseAuto(ps, con);
	}

	@Override
	public List<AccountDTO> searchAseq(String aseq) throws SQLException {
		List<AccountDTO> result = new ArrayList<AccountDTO>();
		Connection con = DBPool.getConnection();
		String sql = "select * from ACCOUNT where aseq like ? order by aseq";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%" + aseq + "%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			result.add(new AccountDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
		}
		DBPool.releaseAuto(ps, con);
		return result;
	}

	@Override
	public List<AccountDTO> searchCseq(int cseq) throws SQLException {
		List<AccountDTO> result = new ArrayList<AccountDTO>();
		Connection con = DBPool.getConnection();
		String sql = "select * from ACCOUNT where cseq = ? order by aseq";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, cseq);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			result.add(new AccountDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
		}
		DBPool.releaseAuto(ps, con);
		return result;
	}

	@Override
	public List<AccountDTO> searchPsec(int pseq) throws SQLException {
		List<AccountDTO> result = new ArrayList<AccountDTO>();
		Connection con = DBPool.getConnection();
		String sql = "select * from ACCOUNT where pseq = ? order by aseq";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pseq);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			result.add(new AccountDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
		}
		DBPool.releaseAuto(ps, con);
		return result;
	}

	@Override
	public List<AccountDTO> searchBalance(int balance) throws SQLException {
		List<AccountDTO> result = new ArrayList<AccountDTO>();
		Connection con = DBPool.getConnection();
		String sql = "select * from ACCOUNT where balance >= ? order by aseq";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, balance);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			result.add(new AccountDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
		}
		DBPool.releaseAuto(ps, con);
		return result;
	}

	@Override
	public void deposit(String aseq, int money) throws SQLException {
		Connection con = DBPool.getConnection();
		String sql = "update ACCOUNT set balance = balance + ? where aseq = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, money);
		ps.setString(2, aseq);
		ps.executeUpdate();
		DBPool.releaseAuto(ps, con);
	}
	
	@Override
	public void withdraw(String aseq, int money) throws SQLException {
		Connection con = DBPool.getConnection();
		String sql = "update ACCOUNT set balance = balance - ? where aseq = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, money);
		ps.setString(2, aseq);
		ps.executeUpdate();
		DBPool.releaseAuto(ps, con);
	}
	

}
