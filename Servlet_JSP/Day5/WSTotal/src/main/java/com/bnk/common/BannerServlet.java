package com.bnk.common;


import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;



@WebServlet("/banners")
public class BannerServlet extends HttpServlet {
	BannerDAO dao=new BannerDAOImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<String> bannerList;
		try {
			bannerList = dao.listBanner();
			Map<String, List<String>> map = new HashMap<>();
			map.put("banners", bannerList);
			Gson gson = new Gson();
			String jsonStr = gson.toJson(map);	
			System.out.println("Banner :"+jsonStr);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(jsonStr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
