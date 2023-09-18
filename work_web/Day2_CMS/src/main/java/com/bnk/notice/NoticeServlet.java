package com.bnk.notice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bnk.Customer;

/**
 * Servlet implementation class NoticeServlet
 */
@WebServlet("/Notice.do")
public class NoticeServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");

		if (action == null) {
			response.sendRedirect("index.html");
		}

		switch (action) {

		case "LIST":
			list(request, response);
			break;

		case "VIEW":
			try {
				view(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case "REG":
			reg(request, response);
			break;

	}
		
		
		

	}

	protected void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
		NoticeMgrImpl instance;
		List<Notice> nos;
		try {
			instance = new NoticeMgrImpl();
			nos = instance.search();
			request.setAttribute("nos", nos);
			
		} catch (SQLException e) {
			request.setAttribute("msg", "불러오기 오류 !");
		}
		
		

		request.getRequestDispatcher("nolist.jsp").forward(request, response);
		
	}

	protected void reg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String cont = request.getParameter("cont");
		String writer = request.getParameter("writer");

		// 3. 요청처리
		// DAO 호출해서 아이디와 패스워드 맞는지 확인하기.
		Notice n = new Notice(writer, title, cont);
		NoticeMgrImpl instance;
		try {
			instance = new NoticeMgrImpl();
			instance.add(n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(n);
		
		// 4. 결과데이터 저장하기.
		request.setAttribute("title", title);
		request.setAttribute("writer", writer);
		request.setAttribute("msg", cont);

		// 5. 결과 페이지로 이동하기.
		request.getRequestDispatcher("result.jsp").forward(request, response); // include도 있는데, include는 다시 돌아오는 것.
																				// forward는 끝내는 것.
		
	}

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num = request.getParameter("cnum");
		int seq = Integer.parseInt(num);

		NoticeMgrImpl instance;
		try {
			instance = new NoticeMgrImpl();
			Notice n = instance.search(seq);
			request.setAttribute("nos", n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("noview.jsp").forward(request, response);
		
	}

}
