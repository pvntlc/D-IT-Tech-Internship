package com.bnk.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bnk.util.DBPool;


public class BannerDAOImpl implements BannerDAO{
	
	@Override
	public List<String> listBanner() throws SQLException {
		List<String> bannerList = new ArrayList<>();
		Connection con = DBPool.getConnection();
		String sql = "select banner_text from banner ";
		PreparedStatement ps =con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			bannerList.add(rs.getString("banner_text"));
		}
		DBPool.release(rs, ps, con);	
		return bannerList;
	}

}
