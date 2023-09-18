<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 정보 보기</title>
<style>
body {
	text-align: center;
}

#container {
	display: inline-block;
	width: 500px;
	display: inline-block;
	border-radius: 20px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px
		rgba(0, 0, 0, 0.23);
	padding-bottom: 20px;
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
	text-align: center;
}

tr, th, td {
	padding: 14px 0;
}

th, td {
	border-top: 1px solid #e7e7e7;
}

#first-tr th, td {
	border-top: none;
}

th {
	padding-right: 5px;
	border-right: 1px solid #e7e7e7;
}

.td-label {
	text-align: center;
	white-space: nowrap;
}

.td-content {
	padding-left: 28px;
	padding-right: 14px;
	text-align: left;
}

tr-content th, tr {
	border-bottom: 1px solid #e7e7e7;
}

#btn-box {
	margin: auto;
	width: 95%;
	display: flex;
	justify-content: space-between;
}

#list-btn {
	float: left;
}

#deposit-btn, #withdraw-btn, #delete-btn {
	text-decoration: none;
	border: 0px;
	background: #555;
	color: white;
	outline: none;
	float: right;
	white-space: nowrap;
	outline: none;
	padding: 5px;
	font-size: 13px;
	margin-left: 5px;
}
</style>
</head>
<body>
	<h1>계좌 정보 보기</h1>
	<div id="container">
		<c:if test="${not empty account}">
			<table>
				<tr id="first-tr">
					<th class="td-label">계좌번호</th>
					<td class="td-content">${account.aseq}</td>
				</tr>
				<tr>
					<th class="td-label">고객번호</th>
					<td class="td-content">${account.cseq}</td>
				</tr>
				<tr>
					<th class="td-label">상품번호</th>
					<td class="td-content">${account.pseq}</td>
				</tr>
				<tr>
					<th class="td-label">잔액</th>
					<td class="td-content">${account.balance}
			</table>
			<div id="btn-box">
				<a id="list-btn" href="account.do?action=LIST">목록보기</a>
				<div>
					<a id="delete-btn"
						href="account.do?action=DELETE&aseq=${account.aseq}"
						onclick="return confirm('정말로 ${account.aseq} 계좌를 삭제하시겠습니까?')">계좌삭제</a>
					<a id="withdraw-btn"
						href="account.do?action=WITHDRAWVIEW&aseq=${account.aseq}">출금</a> <a
						id="deposit-btn"
						href="account.do?action=DEPOSITVIEW&aseq=${account.aseq}">입금</a>

				</div>
			</div>
		</c:if>
	</div>
</body>
</html>