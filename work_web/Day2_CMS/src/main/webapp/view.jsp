<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 상세 정보</h1>
회원번호 : ${cu.cnum }<br/>
회원이름 : ${cu.username }<br/>
관심사 : ${cu.conts }
<p/>
<a href ="index.html">메인페이지로</a>
</body>
</html>