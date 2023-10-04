<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 목록</title>
<style>
body {
	text-align: center;
}

#container {
	display: inline-block;
	width: 1000px;
	margin-bottom: 50px;
}

form {
	width: 100%;
	display: flex;
	justify-content: center;
	background: #f9f7f9;
	padding: 15px 0px;
}

#box {
	border-radius: 20px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px
		rgba(0, 0, 0, 0.23);
}

#search {
	width: 50%;
	height: 30px;
	border: 1px solid #ccc;
	margin-bottom: 5px;
	display: flex;
	justify-content: flex-start;
}

#search-warning {
	padding-top: 20px;
	font-size:13px;
	color: grey;
	background: #f9f7f9;
}

#select-type {
	border: none;
	border-right: 1px solid #ccc;
}

#search input {
	width: 80%;
	box-sizing: border-box;
	height: 30px;
	padding: 10px;
	padding-left: 20px;
	border: 0px;
	outline: none;
	padding: 5px;
}

#search button {
	width: 20%;
	min-width: 50px;
	height: 100%;
	border: 0px;
	background: #555;
	color: white;
	outline: none;
	float: right;
	white-space: nowrap;
	outline: none;
}

h1 {
	font-size: 28px;
	color: #333333;
	font-weight: 400;
	text-align: center;
	margin: 50px 0px 50px 0px;
}

table {
	width: 100%;
	margin-bottom: 10px;
	border-collapse: collapse;
	font-size: 15px;
	border-bottom: 1px solid #ccc;
}

table a {
	color: #333;
	display: inline-block;
	line-height: 1.4;
	font-weight: bold;
	word-break: break-all;
	vertical-align: middle;
	text-decoration: none;
	word-break: break-all;
}

table a:hover {
	text-decoration: underline;
}

table th {
	text-align: center;
}

table th, td {
	padding: 14px 0;
}

table td {
	border-top: 1px solid #e7e7e7;
	text-align: center
}

#bottom-container {
	height: 70px;
}

#regist-btn {
	text-decoration: none;
	border: 0px;
	background: #555;
	color: white;
	outline: none;
	float: right;
	white-space: nowrap;
	outline: none;
	margin: 10px;
	padding: 10px;
	font-size: 15px;
}
</style>
</head>
<body>
	<h1>계좌 목록</h1>
	<div id="container">
		<div id="box">
			<div id="search-warning">* 잔액으로 검색 시 일정 잔액 이상의 계좌를 조회합니다.</div>
			<form action="account.do?action=SEARCH" method="post">
				<div id="search">
					<select id="select-type" name="type">
						<option value="aseq">계좌번호</option>
						<option value="cseq">고객번호</option>
						<option value="pseq">상품번호</option>
						<option value="balance">잔액</option>
					</select> <input placeholder="검색어를 입력해주세요." name="keyword" />
					<button>검색</button>
				</div>
			</form>

			<table>
				<tr>
					<th>계좌 번호</th>
					<th>고객번호</th>
					<th>상품번호</th>
					<th>잔액</th>
				</tr>
				<c:forEach var="a" items="${accountList}">
					<tr>
						<td><a href="account.do?action=VIEW&aseq=${a.aseq}">${a.aseq}</a></td>
						<td>${a.cseq}</td>
						<td>${a.pseq}</td>
						<td>${a.balance}원</td>
					</tr>
				</c:forEach>
			</table>
			<div id="bottom-container">
				<a id="regist-btn" href="regist.jsp">계좌등록</a>
			</div>
		</div>
	</div>
</body>
</html>