/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-14 05:30:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>Insert title here</title>\r\n");
      out.write("	<style>\r\n");
      out.write("		@import url('https://fonts.googleapis.com/css?family=Montserrat:400,800');\r\n");
      out.write("\r\n");
      out.write("		* {\r\n");
      out.write("			box-sizing: border-box;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		div {\r\n");
      out.write("			box-align: center;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		body {\r\n");
      out.write("			background: #f6f5f7;\r\n");
      out.write("			display: flex;\r\n");
      out.write("			justify-content: center;\r\n");
      out.write("			align-items: center;\r\n");
      out.write("			flex-direction: column;\r\n");
      out.write("			font-family: 'Montserrat', sans-serif;\r\n");
      out.write("			height: 100vh;\r\n");
      out.write("			margin: -20px 0 50px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		h1 {\r\n");
      out.write("			font-weight: bold;\r\n");
      out.write("			margin: 0;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		h2 {\r\n");
      out.write("			text-align: center;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		p {\r\n");
      out.write("			font-size: 14px;\r\n");
      out.write("			font-weight: 100;\r\n");
      out.write("			line-height: 20px;\r\n");
      out.write("			letter-spacing: 0.5px;\r\n");
      out.write("			margin: 20px 0 30px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		span {\r\n");
      out.write("			font-size: 12px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		a {\r\n");
      out.write("			color: #333;\r\n");
      out.write("			font-size: 14px;\r\n");
      out.write("			text-decoration: none;\r\n");
      out.write("			margin: 15px 0;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.btn {\r\n");
      out.write("			border-radius: 20px;\r\n");
      out.write("			border: 1px solid #FF4B2B;\r\n");
      out.write("			background-color: #FF4B2B;\r\n");
      out.write("			color: #FFFFFF;\r\n");
      out.write("			font-size: 12px;\r\n");
      out.write("			font-weight: bold;\r\n");
      out.write("			padding: 12px 45px;\r\n");
      out.write("			letter-spacing: 1px;\r\n");
      out.write("			text-transform: uppercase;\r\n");
      out.write("			transition: transform 80ms ease-in;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		button:active {\r\n");
      out.write("			transform: scale(0.95);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		button:focus {\r\n");
      out.write("			outline: none;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		button.ghost {\r\n");
      out.write("			background-color: transparent;\r\n");
      out.write("			border-color: #FFFFFF;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		form {\r\n");
      out.write("			background-color: #FFFFFF;\r\n");
      out.write("			display: flex;\r\n");
      out.write("			align-items: center;\r\n");
      out.write("			justify-content: center;\r\n");
      out.write("			flex-direction: column;\r\n");
      out.write("			padding: 0 50px;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			text-align: center;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		input {\r\n");
      out.write("			background-color: #eee;\r\n");
      out.write("			border: none;\r\n");
      out.write("			padding: 12px 15px;\r\n");
      out.write("			margin: 8px 0;\r\n");
      out.write("			width: 100%;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.container {\r\n");
      out.write("			background-color: #fff;\r\n");
      out.write("			border-radius: 10px;\r\n");
      out.write("			box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25),\r\n");
      out.write("				0 10px 10px rgba(0, 0, 0, 0.22);\r\n");
      out.write("			position: relative;\r\n");
      out.write("			overflow: hidden;\r\n");
      out.write("			width: 480px;\r\n");
      out.write("			max-width: 100%;\r\n");
      out.write("			min-height: 480px;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.form-container {\r\n");
      out.write("			position: absolute;\r\n");
      out.write("			top: 0;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			transition: all 0.6s ease-in-out;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.sign-in-container {\r\n");
      out.write("			left: 0;\r\n");
      out.write("			width: 100%;\r\n");
      out.write("			z-index: 2;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.container.right-panel-active .sign-in-container {\r\n");
      out.write("			transform: translateX(100%);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.sign-up-container {\r\n");
      out.write("			left: 0;\r\n");
      out.write("			width: 100%;\r\n");
      out.write("			opacity: 0;\r\n");
      out.write("			z-index: 1;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.container.right-panel-active .sign-up-container {\r\n");
      out.write("			transform: translateX(100%);\r\n");
      out.write("			opacity: 1;\r\n");
      out.write("			z-index: 5;\r\n");
      out.write("			animation: show 0.6s;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		@keyframes show {\r\n");
      out.write("\r\n");
      out.write("			0%,\r\n");
      out.write("			49.99% {\r\n");
      out.write("				opacity: 0;\r\n");
      out.write("				z-index: 1;\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			50%,\r\n");
      out.write("			100% {\r\n");
      out.write("				opacity: 1;\r\n");
      out.write("				z-index: 5;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.overlay-container {\r\n");
      out.write("			position: absolute;\r\n");
      out.write("			top: 0;\r\n");
      out.write("			left: 50%;\r\n");
      out.write("			width: 50%;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			overflow: hidden;\r\n");
      out.write("			transition: transform 0.6s ease-in-out;\r\n");
      out.write("			z-index: 100;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.container.right-panel-active .overlay-container {\r\n");
      out.write("			transform: translateX(-100%);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.overlay {\r\n");
      out.write("			background: #FF416C;\r\n");
      out.write("			background: -webkit-linear-gradient(to right, #FF4B2B, #FF416C);\r\n");
      out.write("			background: linear-gradient(to right, #FF4B2B, #FF416C);\r\n");
      out.write("			background-repeat: no-repeat;\r\n");
      out.write("			background-size: cover;\r\n");
      out.write("			background-position: 0 0;\r\n");
      out.write("			color: #FFFFFF;\r\n");
      out.write("			position: relative;\r\n");
      out.write("			left: -100%;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			width: 200%;\r\n");
      out.write("			transform: translateX(0);\r\n");
      out.write("			transition: transform 0.6s ease-in-out;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.container.right-panel-active .overlay {\r\n");
      out.write("			transform: translateX(50%);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.overlay-panel {\r\n");
      out.write("			position: absolute;\r\n");
      out.write("			display: flex;\r\n");
      out.write("			align-items: center;\r\n");
      out.write("			justify-content: center;\r\n");
      out.write("			flex-direction: column;\r\n");
      out.write("			padding: 0 40px;\r\n");
      out.write("			text-align: center;\r\n");
      out.write("			top: 0;\r\n");
      out.write("			height: 100%;\r\n");
      out.write("			width: 50%;\r\n");
      out.write("			transform: translateX(0);\r\n");
      out.write("			transition: transform 0.6s ease-in-out;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.overlay-left {\r\n");
      out.write("			transform: translateX(-20%);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.container.right-panel-active .overlay-left {\r\n");
      out.write("			transform: translateX(0);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.overlay-right {\r\n");
      out.write("			right: 0;\r\n");
      out.write("			transform: translateX(0);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		.container.right-panel-active .overlay-right {\r\n");
      out.write("			transform: translateX(20%);\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>Account Register Form</h2>\r\n");
      out.write("	<div class=\"container\" id=\"container\">\r\n");
      out.write("		<div class=\"form-container sign-in-container\">\r\n");
      out.write("			<form method=\"POST\" action=\"AccountServlet?action=REG\">\r\n");
      out.write("				<h1>Register Account</h1>\r\n");
      out.write("				<span>or eating lunch</span>\r\n");
      out.write("				<input type=\"text\" id=\"aseq\" name=\"aseq\" value=\"계좌번호\" required />\r\n");
      out.write("				<input type=\"text\" id=\"cseq\" name=\"cseq\" value=\"고객번호\" required />\r\n");
      out.write("				<input type=\"text\" id=\"pseq\" name=\"pseq\" value=\"상품번호\" required />\r\n");
      out.write("				<input type=\"password\" id=\"password\" name=\"password\" value=\"비밀번호\" minlength=\"6\" />\r\n");
      out.write("\r\n");
      out.write("				<a href=\"#\">Let's play soccer!</a>\r\n");
      out.write("				<div >\r\n");
      out.write("					<input type=\"submit\" id=\"btn\" value=\"계좌등록\" />\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
