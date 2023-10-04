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
	<h1>메인 페이지</h1>
	${msg }
		<a href="${root}/regView">상품 등록하기</a>
</body>
</html>