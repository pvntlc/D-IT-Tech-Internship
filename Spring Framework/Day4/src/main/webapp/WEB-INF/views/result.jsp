<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value = "${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 목록 보여주기</h1>
	<c:if test="${empty msg }">
		<c:forEach var="cu" items="${list }">
			<div>${cu.cnum }</div>
			<div>${cu.username }</div>
		</c:forEach>
	</c:if>
	${msg}

</body>
</html>