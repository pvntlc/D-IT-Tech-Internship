package com.bnk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/AccountServlet", "/account.do" })
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountService service;

	public AccountServlet() {
		super();
		service = new AccountServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		switch (action) {
		case "LIST":
			list(request, response);
			break;
		case "REGIST":
			regist(request, response);
			break;
		case "DELETE":
			delete(request, response);
			break;
		case "VIEW":
			view(request, response);
			break;
		case "SEARCH":
			search(request, response);
			break;
		case "DEPOSITVIEW":
			depositView(request, response);
			break;
		case "WITHDRAWVIEW":
			withdrawView(request, response);
			break;
		case "DEPOSITSAVE":
			depositSave(request, response);
			break;
		case "WITHDRAWSAVE":
			withdrawSave(request, response);
			break;
		}
	}

	private void withdrawView(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void withdrawSave(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void depositView(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String aseq = request.getParameter("aseq");
		request.setAttribute("aseq", aseq);
		request.getRequestDispatcher("deposit.jsp").forward(request, response);
		;
	}

	private void depositSave(HttpServletRequest request, HttpServletResponse response) {
		request.getParameter("money");
	}

	private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String keyword = request.getParameter("keyword");
		List<AccountDTO> list;
		switch (type) {
		case "aseq":
			try {
				list = service.searchAseq(keyword);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("accountList.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "cseq":
			try {
				list = service.searchCseq(keyword);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("accountList.jsp").forward(request, response);
			} catch (NumberFormatException | SQLException e) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('계좌 목록 조회 중 오류 발생.'); location.href='index.jsp';</script>");
				out.flush();
				e.printStackTrace();
			}
			break;
		case "pseq":
			try {
				list = service.searchPsec(keyword);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("accountList.jsp").forward(request, response);
			} catch (NumberFormatException | SQLException e) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('계좌 목록 조회 중 오류 발생.'); location.href='index.jsp';</script>");
				out.flush();
				e.printStackTrace();
			}

			break;
		case "balance":
			try {
				list = service.searchBalance(keyword);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("accountList.jsp").forward(request, response);
			} catch (NumberFormatException | SQLException e) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('계좌 목록 조회 중 오류 발생.'); location.href='index.jsp';</script>");
				out.flush();
				e.printStackTrace();
			}

			break;
		}

	}

	private void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aseq = request.getParameter("aseq");
		try {
			AccountDTO account = service.search(aseq);
			request.setAttribute("account", account);
			request.getRequestDispatcher("accountView.jsp").forward(request, response);
		} catch (SQLException e) {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('계좌 조회 중 오류 발생.'); location.href='account.do?action=LIST';</script>");
			out.flush();
			e.printStackTrace();
		}
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String aseq = request.getParameter("aseq");
		try {
			service.delete(aseq);
			response.sendRedirect("account.do?action=LIST");
		} catch (SQLException e) {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('계좌 삭제 중 오류 발생.'); location.href='account.do?action=LIST';</script>");
			out.flush();
			e.printStackTrace();

		}
	}

	private void regist(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String aseq = request.getParameter("aseq");
		int cseq = Integer.parseInt(request.getParameter("cseq"));
		int pseq = Integer.parseInt(request.getParameter("pseq"));
		int balance = Integer.parseInt(request.getParameter("balance"));
		String password = request.getParameter("password");
		AccountDTO account = new AccountDTO(aseq, cseq, pseq, balance, password);
		try {
			service.add(account);
			request.setAttribute("aseq", aseq);
			view(request, response);
		} catch (SQLException e) {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('계좌 등록 중 오류 발생.'); location.href='account.do?action=LIST';</script>");
			out.flush();
			e.printStackTrace();
		}
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<AccountDTO> list = service.search();
			request.setAttribute("accountList", list);
			request.getRequestDispatcher("accountList.jsp").forward(request, response);
		} catch (SQLException e) {
			PrintWriter out = response.getWriter();
			out.println("<script>alert('계좌 목록 조회 중 오류 발생.'); location.href='index.jsp';</script>");
			out.flush();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
