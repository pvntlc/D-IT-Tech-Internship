package com.bnk.notice;

import java.io.IOException;
import java.sql.SQLException;

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
@WebServlet("/Notice.do1")
public class NoticeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
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

}
