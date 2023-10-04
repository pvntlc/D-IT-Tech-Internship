<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>디카페인 아메리카노 칸타타</title>
<style>
body {
	color: #666;
	font: 14px/24px "Open Sans", "HelveticaNeue-Light",
		"Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial,
		"Lucida Grande", Sans-Serif;
}

table {
	border-collapse: separate;
	border-spacing: 0;
	width: 100%;
}

th, td {
	padding: 6px 15px;
}

th {
	background: #42444e;
	color: #fff;
	text-align: center;
}

tr:first-child th:first-child {
	border-top-left-radius: 6px;
}

tr:first-child th:last-child {
	border-top-right-radius: 6px;
}

td {
	border-right: 1px solid #c6c9cc;
	border-bottom: 1px solid #c6c9cc;
}

td:first-child {
	border-left: 1px solid #c6c9cc;
}

tr:nth-child(even) td {
	background: #eaeaed;
}

tr:last-child td:first-child {
	border-bottom-left-radius: 6px;
}

tr:last-child td:last-child {
	border-bottom-right-radius: 6px;
}
</style>
</head>

<body>
	<table>
		<thead>
			<tr>
				<th>유저번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="n" items="${nlist}">
				<tr>
					<td>${n.seq}</td>
					<td>${n.writer}</td>
					<td>${n.title}</td>
					<td>${n.cont}</td>
					<td>>${n.createdat}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

</html>