<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value = "${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인메인페이지입니다</title>
</head>
<body>
	<h1>메인 김팡틱</h1>
	${msg }
	<c:if test="${empty userName }">
		<a href="${root}/user/loginView">로그인</a>
		<a href="${root}/user/regView">회원가입</a>
		<br>
	</c:if>

	<c:if test="${not empty userName }">
		<a href="${root}/user/logout">로그아웃</a>
		<br>
		<a href="${root}/user/list">회원 목록 보기</a>
		<a href="${root }/notice/regView">공지사항 등록하기</a>
		<a href="${root }/notice/list">공지사항 목록 보기</a>
	</c:if>
</body>
</html>