package com.bnk.cms;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bnk.Customer;
import com.bnk.CustomerDAO;

@WebServlet("/main.do")
public class MainServlet extends HttpServlet {

	CustomerDAO dao = new CustomerDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");

		if (action == null) {
			response.sendRedirect("index.html");
		}

		switch (action) {
		case "REG":
			reg(request, response);
			break;

		case "LIST":
			list(request, response);
			break;

		case "VIEW":
			view(request, response);
			break;

		case "LOGIN":
			login(request, response);
			break;

		case "LOGOUT":
			logout(request, response);
			break;

		case "DEL":
			delete(request, response);
			break;
		
		case "MODIFYVIEW":
			modifyView(request, response);
			break;
		
		case "MODIFYSAVE":
			modifySave(request, response);
			break;
		}
	}

	protected void modifyView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cnum = request.getParameter("cnum");
		int num = Integer.parseInt(cnum);
		
		try {
			Customer cu = dao.search(num);
			request.setAttribute("cu", cu);
		} catch (SQLException e) {
			request.setAttribute("msg", "등록 중에 오류가 발생했습니다.");
		}
		
		request.getRequestDispatcher("modify.jsp").forward(request, response);
		
	}
	
	protected void modifySave(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cnum = request.getParameter("cnum");
		int num = Integer.parseInt(cnum);
		String[] conts = request.getParameterValues("conts");
		String contsTo = String.join(",", conts);
		
		try {
			dao.update(num, contsTo);
			request.setAttribute("msg", "정상적으로 업데이트되었습니다.");
		} catch (SQLException e) {
			request.setAttribute("msg", "업데이트 중 오류가 발생했습니다.");
		}
		
		request.getRequestDispatcher("result.jsp").forward(request, response);
		
	}

	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String pw = request.getParameter("pw");

		try {
			if (dao.login(userName, pw)) {
				request.setAttribute("msg", userName + "님 로그인 성공 !");
				HttpSession hs = request.getSession();
				hs.setAttribute("userName", userName);
			} else {
				request.setAttribute("msg", "로그인 실패 !");
			}
		} catch (SQLException e) {
			request.setAttribute("msg", "오류 발생 !");
		}

		request.getRequestDispatcher("result.jsp").forward(request, response);

	}

	protected void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cnum = request.getParameter("cnum");
		int num = Integer.parseInt(cnum);

		try {
			Customer cu = dao.search(num);
			request.setAttribute("cu", cu);
		} catch (SQLException e) {
			request.setAttribute("msg", "등록 중에 오류가 발생했습니다.");
		}

		request.getRequestDispatcher("view.jsp").forward(request, response);

	}

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Customer> cus;
		try {
			cus = dao.search();
			request.setAttribute("cusList", cus);

		} catch (SQLException e) {
			request.setAttribute("msg", "불러오기 오류 !");
		}

		request.getRequestDispatcher("list.jsp").forward(request, response);

	}

	protected void reg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("pw");
		String[] conts = request.getParameterValues("conts");
		String contsTo = String.join(",", conts);
		HttpSession hs = request.getSession();

		Customer c = new Customer(userName, password, contsTo);
		try {
			dao.add(c);
			hs.setAttribute("msg", "정상적으로 등록되었습니다.");
		} catch (SQLException e) {
			hs.setAttribute("msg", "등록 중에 오류가 발생했습니다.");
		}
		
		response.sendRedirect("result.jsp");


	}

	protected void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession hs = request.getSession(false);
		if (hs != null) {
			hs.invalidate();
		}

		response.sendRedirect("index.jsp");

	}

	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cnum = request.getParameter("cnum");
		int num = Integer.parseInt(cnum);

		try {
			dao.delete(num);
			request.setAttribute("msg", "정상적으로 삭제되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			request.setAttribute("msg", "삭제 오류 !");
		}
		
//		list(request, response);

		request.getRequestDispatcher("result.jsp").forward(request, response);

	}

}
