<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	사용자 :
	<%
String user = (String) session.getAttribute("user");
out.println(user);
%>
	<p />
	사용자 :
	<%=user%>
	<p />
	사용자 : ${user}
</body>
</html>