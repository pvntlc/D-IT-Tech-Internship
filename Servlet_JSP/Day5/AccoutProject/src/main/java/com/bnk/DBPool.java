package com.bnk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBPool {
	public static Connection getConnection() {
		Connection con = null;
		try {
			// java 실행환경 접근
			Context context = (Context) new InitialContext().lookup("java:comp/env/");
			
			// jdbc/OracleDB 이름의 데이터베이스 리소스에 엑세스한다.
			DataSource datasource = (DataSource) context.lookup("jdbc/OracleDB");
			con = datasource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	// 연결 끊기
	public static void release(PreparedStatement pstmt, Connection con) {

		try {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void release(ResultSet rs, PreparedStatement pstmt, Connection con) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ... 표현식 사용하여 다양한 파라미터 개수에 대응
	public static void releaseAuto(AutoCloseable... params) {
		for (AutoCloseable c : params) {
			if (c != null) {
				try {
					c.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}