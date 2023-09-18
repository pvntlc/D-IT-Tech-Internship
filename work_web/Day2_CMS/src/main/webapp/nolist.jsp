<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디카페인 아메리카노 먹고 싶어요</title>
</head>
<body>
	<h1>공지사항 목록</h1>
	<table>
		<tr>
		<th>게시글 번호</th>
			<th>제목</th>
			<th>작성날짜</th>
		</tr>
		<c:forEach var="nos" items="${nos}">
		<tr><td><a href="Notice.do?action=LIST&cnum=${nos.seq} "> ${nos.seq}</td><td>${nos.title}</td><td>${nos.createdat}</td></tr>
		</c:forEach>
	</table>
<a href="index.html">메인페이지로 돌아가자!</a>
</body>
</html>