/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-14 06:33:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1694496219252L));
    _jspx_dependants.put("jar:file:/C:/BNK/work_web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/AccoutProject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1694661939470L));
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>BNK 부산은행 계좌 서비스</title>\r\n");
      out.write("<style>\r\n");
      out.write("nav {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	/*  너비 */\r\n");
      out.write("	height: 80px;\r\n");
      out.write("	/* 높이 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav a:hover {\r\n");
      out.write("	text-decoration: underline;\r\n");
      out.write("	color: #cb2b11;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar ul {\r\n");
      out.write("	padding-left: 0;\r\n");
      out.write("	list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logo_img {\r\n");
      out.write("	width: 180px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	list-style-type: none;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar .left {\r\n");
      out.write("	margin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar li {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	margin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar>li>a {\r\n");
      out.write("	display: block;\r\n");
      out.write("	font-size: 17px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	line-height: 50px;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	white-space: nowrap;\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("	text-overflow: ellipsis;\r\n");
      out.write("	margin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar>li>a:hover {\r\n");
      out.write("	text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar #userName {\r\n");
      out.write("	white-space: nowrap;\r\n");
      out.write("	font-weight: normal;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar #logout {\r\n");
      out.write("	font-weight: normal;\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#navbar #logout:hover {\r\n");
      out.write("	color: #cb2b11;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#profile {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	font-size: 17px;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	padding: 10px 0px;\r\n");
      out.write("	padding-left: 30px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	line-height: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#profileImg {\r\n");
      out.write("	width: 40px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav-divider {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 2px;\r\n");
      out.write("	background-color: #cb2b11;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"main-container\">\r\n");
      out.write("		<nav>\r\n");
      out.write("			<ul id=\"navbar\">\r\n");
      out.write("				<li class=\"left\"><a href=\"index.jsp\"> <img id=\"logo_img\"\r\n");
      out.write("						src=\"img/logo.jpg\" />\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"account.do?action=LIST\">계좌목록</a></li>\r\n");
      out.write("				<li><a href=\"regist.jsp\">계좌등록</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<div id=\"nav-divider\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>BNK 부산은행 계좌 서비스</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("	font-size: 40px;\r\n");
      out.write("	color: #333333;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main-container {\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main-content {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#banner-title {\r\n");
      out.write("	margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#intership-video {\r\n");
      out.write("	margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("	function changeScroll() {\r\n");
      out.write("		var iframe = document.getElementById('bnk-homepage');\r\n");
      out.write("		iframe.contentWindow.scrollTo(0, 50);\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"changeScroll()\">\r\n");
      out.write("	<div id=\"main-container\">\r\n");
      out.write("		<div>\r\n");
      out.write("			<div>\r\n");
      out.write("				<h1>BNK 부산은행</h1>\r\n");
      out.write("				<div id=\"main-content\">\r\n");
      out.write("					<img src=\"img/bnk_character2.jpg\" />\r\n");
      out.write("					<iframe id=\"intership-video\" width=\"1120\" height=\"630\"\r\n");
      out.write("						src=\"https://www.youtube.com/embed/c7AoeK7Jros?si=MrWn_ErL2a_FHk0c\"\r\n");
      out.write("						title=\"YouTube video player\" frameborder=\"0\"\r\n");
      out.write("						allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"\r\n");
      out.write("						allowfullscreen> </iframe>\r\n");
      out.write("					<img src=\"img/bnk_character3.jpg\" />\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
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