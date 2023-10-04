package com.bnk.model;

import java.sql.*;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class NoticeMgrImpl implements INoticeMgr {


	@Override
	public void add(Notice n) {
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBUtil.getConnection();
			String sql = "INSERT INTO NOTICE VALUES(ORDERS_NOSEQ.NEXTVAL,?,?,?,SYSDATE)";
			st = con.prepareStatement(sql);
			st.setString(1, n.getWriter());
			st.setString(2, n.getTitle());
			st.setString(3, n.getCont());
			st.executeUpdate(); // insert, update, delete할때 주로 사용함.

		} catch (SQLException e) {
			System.out.println("저장 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Notice> search() {
		ArrayList<Notice> result = new ArrayList<Notice>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			String sql = "SELECT * FROM NOTICE ORDER BY SEQ";

			st = con.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				result.add(
						new Notice(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}

		} catch (SQLException e) {
			System.out.println("저장 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public Notice search(int seq) {
		Notice no = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			String sql = "SELECT * FROM NOTICE WHERE SEQ = " + seq;

			st = con.createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				no = new Notice(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}

		} catch (SQLException e) {
			System.out.println("저장 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return no;
	}

	@Override
	public List<Notice> search(String title) {
		ArrayList<Notice> result = new ArrayList<Notice>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = DBUtil.getConnection();
			String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%" + title + "%'";

			st = con.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				result.add(
						new Notice(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}

		} catch (SQLException e) {
			System.out.println("저장 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public void delete(int seq) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBUtil.getConnection();
			String sql = "DELETE NOTICE WHERE SEQ = ?";

			ps = con.prepareStatement(sql);
			ps.setInt(1, seq);
			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("삭제 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update(int cnum, String title, String cont) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement st = null;
		try {
			con = DBUtil.getConnection();
			String sql = "UPDATE NOTICE SET TITLE = ?, CONT = ? WHERE SEQ = ?";
			st = con.prepareStatement(sql);
			st.setString(1, title);
			st.setString(2, cont);
			st.setInt(3, cnum);
			st.executeUpdate(); // insert, update, delete할때 주로 사용함.

		} catch (SQLException e) {
			System.out.println("저장 중 오류 발생");
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}