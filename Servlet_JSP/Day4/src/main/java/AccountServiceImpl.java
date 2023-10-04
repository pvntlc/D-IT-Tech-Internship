import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AccountServiceImpl {
	AccountDAOImpl dao = new AccountDAOImpl();

	public void reg(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String aseq = request.getParameter("aseq");
		String password = request.getParameter("password");
		HttpSession hs = request.getSession();
		String cseq1 = request.getParameter("cseq");
		String pseq1 = request.getParameter("pseq");
		int cseq = Integer.parseInt(cseq1);
		int pseq = Integer.parseInt(pseq1);
		
		AccountDTO ac = new AccountDTO(aseq, cseq, pseq, 0, password);
		try {
			dao.add(ac);
			hs.setAttribute("msg", "정상적으로 등록되었습니다.");
		}
		catch(SQLException e) {
			hs.setAttribute("msg", "등록 중 오류 발생");
		}
		
		response.sendRedirect("result.jsp");
		
	}

	public void list(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String aseq = request.getParameter("aseq");
		HttpSession hs = request.getSession();
		List<AccountDTO> ac;
		
		try {
			ac = dao.search();
			hs.setAttribute("accountList", ac);
		} catch (SQLException e) {
			hs.setAttribute("msg", "불러오기 오류 !");
		}
		response.sendRedirect("list.jsp");
		
		
	}

	public void view(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String aseq = request.getParameter("aseq");
		HttpSession hs = request.getSession();
		AccountDTO ac;
		
		try {
			ac = dao.search(aseq);
			hs.setAttribute("accountList", ac);
		} catch (SQLException e) {
			hs.setAttribute("msg", "불러오기 오류 !");
		}
		response.sendRedirect("view.jsp");
		
	}

	public void del(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String aseq = request.getParameter("aseq");
		HttpSession hs = request.getSession();
		try {
			dao.delete(aseq);
			hs.setAttribute("msg", "정상적으로 삭제됨 !");
		} catch (SQLException e) {
			hs.setAttribute("msg", "삭제하기 오류 !");
			// TODO Auto-generated catch block
		}
		response.sendRedirect("index.jsp");
		
	}

	public void modifyView(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String aseq = request.getParameter("aseq");
		HttpSession hs =request.getSession();
		AccountDTO ac;
		try {
			ac = dao.search(aseq);
			hs.setAttribute("accountList", ac);
		} catch (SQLException e) {
			hs.setAttribute("msg", "수정 중 오류 발생 !");
		}
		response.sendRedirect("modify.jsp");
		// TODO Auto-generated method stub
		
	}

	public void modifySave(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String aseq = request.getParameter("aseq");
		HttpSession hs =request.getSession();
		String cseq1 = request.getParameter("cseq");
		String pseq1 = request.getParameter("pseq");
		int cseq = Integer.parseInt(cseq1);
		int pseq = Integer.parseInt(pseq1);
		
		try {
			dao.update(aseq, cseq, pseq);
			hs.setAttribute("msg", "정상적으로 업데이트되었습니다.");
		} catch (SQLException e) {

			hs.setAttribute("msg", "업데이트 중 오류 발생");
		}
		
		response.sendRedirect("result.jsp");
		
	}

	public void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String keyword = request.getParameter("keyword");
		List<AccountDTO> list;
		
		switch (type) {
		case "aseq":
			try {
				list = dao.searchAseq(keyword);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("list.jsp").forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "cseq":
			try {
				int number = Integer.parseInt(keyword);
				list = dao.searchCseq(number);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("list.jsp").forward(request, response);
			} catch (NumberFormatException | SQLException e) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('계좌 목록 조회 중 오류 발생.'); location.href='index.jsp';</script>");
				out.flush();
				e.printStackTrace();
			}
			break;
		case "pseq":
			try {
				int number = Integer.parseInt(keyword);
				list = dao.searchPsec(number);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("list.jsp").forward(request, response);
			} catch (NumberFormatException | SQLException e) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('계좌 목록 조회 중 오류 발생.'); location.href='index.jsp';</script>");
				out.flush();
				e.printStackTrace();
			}

			break;
		case "balance":
			try {
				int number = Integer.parseInt(keyword);
				list = dao.searchBalance(number);
				request.setAttribute("accountList", list);
				request.getRequestDispatcher("list.jsp").forward(request, response);
			} catch (NumberFormatException | SQLException e) {
				PrintWriter out = response.getWriter();
				out.println("<script>alert('계좌 목록 조회 중 오류 발생.'); location.href='index.jsp';</script>");
				out.flush();
				e.printStackTrace();
			}

			break;
		}
		
	}
	
	
	

}