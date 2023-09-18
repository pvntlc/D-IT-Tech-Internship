<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="pragma" content="no-cache" />
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	text-align: center;
}
</style>
</head>

<body>
	<h1>메인 페이지</h1>
	<c:if test="${empty userName }">
		<jsp:include page="login.html" />
		<a href="register.html">회원가입</a>
		<br>
	</c:if>

	<c:if test="${not empty userName }">
		<a href="main.do?action=LOGOUT">로그아웃</a>
		<br>
		<a href="main.do?action=LIST">회원 목록 보기</a>
		<br>
		<a href="notice.html">공지사항 쓰기</a>
		<br>
		<a href="Notice.do?action=VIEW">공지사항 목록 보기</a>
	</c:if>
</body>

</html>