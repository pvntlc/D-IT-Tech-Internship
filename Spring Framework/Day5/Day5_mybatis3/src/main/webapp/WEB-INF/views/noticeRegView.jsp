<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>공지사항</title>
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

		form {
			max-width: 600px;
			margin: 0 auto;
			background-color: #fff;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
		}

		label,
		input,
		textarea {
			display: block;
			margin-bottom: 20px;
		}

		label {
			font-weight: bold;
		}

		input[type="text"],
		textarea {
			width: 100%;
			padding: 2px;
			border: 1px solid #ccc;
			border-radius: 4px;
			font-size: 16px;
		}

		input[type="submit"] {
			background-color: #3498db;
			color: #fff;
			border: none;
			padding: 10px 20px;
			font-size: 18px;
			border-radius: 5px;
			cursor: pointer;
		}

		input[type="submit"]:hover {
			background-color: rgb(0, 0, 160);
		}

		#noticeList {
			margin-top: 20px;
			border-top: 1px solid #ccc;
			padding-top: 20px;
		}

		#noticeList strong {
			font-size: 18px;
			color: #3498db;
		}

		#noticeList p {
			font-size: 16px;
			margin-top: 10px;
		}
		
</style>
</head>

<body>
	<h1>공지사항 입력</h1>
	<form  method="post" action="${root }/notice/reg">
		<label for="title">제목</label>
		<input type="text" id="title" name="title" required><br><br>
		<label for="cont">내용</label>
		<textarea id="cont" name="cont" rows="4" required></textarea><br><br>
		<input type="submit" value="등록" onclick="openConfirm();" id="button">
	</form>

</body>
	<script>
		function openConfirm() {
			confirm("정말 제출하실건가요?");}
	</script>

</html>