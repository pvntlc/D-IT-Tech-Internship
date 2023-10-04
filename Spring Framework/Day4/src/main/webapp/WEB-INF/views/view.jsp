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
<img src="${root }/resources/img/${cus.imgInfo }"/>
<br>
회원번호 : ${cus.cnum }<br/>
회원이름 : ${cus.username}<br/>
관심사 : ${cus.conts }
<p/>
<a href ="${root }/user/modifyView?cnum=${cus.cnum}">수정하기</a>
<a href ="${root }">메인페이지로</a>

</body>
</html>