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
	<h1>공지사항 자세히 보기</h1>
작성자 : ${nos.writer }<br/>
내용 : ${nos.cont}
<a href="Notice.do?action=MODIFYVIEW&seq=${nos.seq }">수정하기</td>
<a href="index.jsp">메인페이지로 돌아가자!</a>
</body>
</html>