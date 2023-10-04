<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 0;
			background-color: #f2f2f2;
		}

		h1 {
			text-align: center;
			padding: 20px;
			background-color: #3498db;
			color: #fff;
		}

		div {
			max-width: 600px;
			margin: 0 auto;
			background-color: #fff;
			padding: 20px;
			border-radius: 5px;
		}

		label,
		div {
			display: block;
			margin-bottom: 20px;
		}

		label {
			font-weight: bold;
		}

		div {
			width: 100%;
			padding: 200px;
			border: 1px solid #ccc;
			border-radius: 4px;
			font-size: 16px;
			text-align:center;
		}

		
</style>
</head>
<body>
<h1>공지사항 상세 정보</h1>
<label for="title">제목</label>
<div>${cus.title}</div>
<label for="writer">작성자</label>
<div>${cus.writer}</div>
<label for="cont">내용</label>
<div>${cus.cont}</div>
<p/>
<a href ="${root }/notice/updateView?cnum=${cus.seq}">수정하기</a>
<a href ="${root }">메인페이지로</a>

</body>
</html>