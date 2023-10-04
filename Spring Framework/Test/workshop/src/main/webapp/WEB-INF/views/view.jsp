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
<h1>회원 상세 정보</h1>
<img src="${root }/resources/img/${phones.pimg}"/>
<br>
회원번호 : ${phones.pnum }<br/>
회원이름 : ${phones.title}<br/>
관심사 : ${phones.price }
<p/>
<a href ="${root }">메인페이지로</a>

</body>
</html>