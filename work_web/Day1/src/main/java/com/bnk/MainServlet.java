package com.bnk;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/main.do")
public class MainServlet extends HttpServlet {
	private CustomerDAO dao;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlet() {
		dao = new CustomerDAO();
		System.out.println("MainServlet 생성자");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MainServlet init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("MainServlet destroy()");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("MainServlet service()");
//		request.setCharacterEncoding("utf-8");
//
//		// 2. 클라이언트 데이터를 추출한다.
//		String userid = request.getParameter("userid");
//		String pw = request.getParameter("pw");
//		System.out.println(userid);
//		System.out.println(pw);
//
//		// 3. 요청처리
//		// DAO 호출해서 아이디와 패스워드 맞는지 확인하기.
//
//		// 4. 결과데이터 저장하기.
//		request.setAttribute("userid", userid);
//		request.setAttribute("msg", "로그인 성공");
//
//		// 5. 결과 페이지로 이동하기.
//		request.getRequestDispatcher("result.jsp").forward(request, response); // include도 있는데, include는 다시 돌아오는 것.
//																				// forward는 끝내는 것.
//
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("MainServlet doGet()");

		request.setCharacterEncoding("utf-8");
		// 1. 클라이언트의 요청 파악.
		// 2. 클라이언트 데이터를 추출한다.
		String userName = request.getParameter("userName");
		String pw = request.getParameter("pw");
		System.out.println(userName);
		System.out.println(pw);
		

		// 3. 요청처리
		// DAO 호출해서 아이디와 패스워드 맞는지 확인하기.
		
		try {
			if(dao.login(userName, pw)) {
				// 4. 결과데이터 저장하기.
				request.setAttribute("userid", userName);
				request.setAttribute("msg", "로그인 성공");
			}
			else {
				// 4. 결과데이터 저장하기.
				request.setAttribute("userid", userName);
				request.setAttribute("msg", "아이디 또는 비밀번호가 틀립니다.");
			}
		} catch (SQLException e) {
			// 4. 결과데이터 저장하기.
			request.setAttribute("userid", userName);
			request.setAttribute("msg", "오류 발생.");
		}

		


		// 5. 결과 페이지로 이동하기.
		request.getRequestDispatcher("result.jsp").forward(request, response); // include도 있는데, include는 다시 돌아오는 것.
																				// forward는 끝내는 것.

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("MainServlet doPost()");

		request.setCharacterEncoding("utf-8");

		// 2. 클라이언트 데이터를 추출한다.
		String userName = request.getParameter("userName");
		String pw = request.getParameter("pw");
		String[] conts = request.getParameterValues("conts");
		String contsTo = "";

		if (conts != null) {
			contsTo = String.join(",", conts);
		}

		// 3. 요청처리
		// DAO 호출해서 아이디와 패스워드 맞는지 확인하기.
		Customer c = new Customer(userName, pw, contsTo);
		System.out.println(c);
		try {
			dao.add(c);
			// 4. 결과데이터 저장하기.
			request.setAttribute("userid", userName);
			request.setAttribute("msg", "회원가입 완료");
		} catch (SQLException e) {
			// 4. 결과데이터 저장하기.
			request.setAttribute("userid", userName);
			request.setAttribute("msg", "회원가입 중 오류 발생");
			e.printStackTrace();
		}

		// 5. 결과 페이지로 이동하기.
		request.getRequestDispatcher("result.jsp").forward(request, response); // include도 있는데, include는 다시 돌아오는 것.
																				// forward는 끝내는 것.

	}

}
