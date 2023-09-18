package com.bnk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTest {
	public static void main(String[] args) throws Exception {
		// DB연동
		// 1.Driver 생성
		// new oracle.jdbc.driver.OracleDriver();
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. Connection 연동
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "SCOTT", "TIGER");

		// 3. 쿼리 생성
		String sql = "SELECT * FROM EMP";

		// 4. Statement 객체 생성
		Statement st = con.createStatement();
				
		// 5. 쿼리 실행
		ResultSet rs = st.executeQuery(sql);

		// 6. 결과 처리
		while(rs.next()) {
			//한줄씩 이동해서 데이터가 있으면 true, 없으면 false.
			System.out.println(rs.getObject(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}

		// 7. 자원 반납
		rs.close();
		st.close();
		con.close();
	}

}
