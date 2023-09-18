
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	
	AccountServiceImpl as = new AccountServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		
		if(action == null) {
			response.sendRedirect("index.jsp");
		}
		switch(action) {
		
		case "REG":
			as.reg(request, response);
			break;

		case "LIST":
			as.list(request, response);
			break;
		
		case "SEARCH":
			as.search(request, response);

		case "VIEW":
			as.view(request, response);
			break;
		
		case "DEL":
			as.del(request, response);
			break;
		case "MODIFYVIEW":
			as.modifyView(request, response);
			break;
		case "MODIFYSAVE":
			as.modifySave(request, response);
			break;
		}

	}

}
