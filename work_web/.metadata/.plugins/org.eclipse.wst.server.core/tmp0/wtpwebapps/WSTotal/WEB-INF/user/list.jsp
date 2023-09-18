<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<script>
	function del(useq) {
		var result = confirm("정말 삭제하실건가요?");
		if (result) {
			alert("삭제하겠습니다.");
			location.href = "user.do?action=DEL&useq=" + useq;
		} else {
			alert("취소하였습니다.");
		}
	}
</script>
</head>

<body>
	<table>
		<thead>
			<tr>
				<th>고객번호</th>
				<th>이름</th>
				<th>이메일</th>
				<th>핸드폰 번호</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ul" items="${ul}">
				<tr>
					<td><a href="user.do?action=VIEW&useq=${ul.useq} ">${ul.useq}</td>
					<td>${ul.name}</td>
					<td>${ul.email}</td>
					<td>${ul.phone}</td>
					<td><a href="javascript:del(${ul.useq})">삭제</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="index.jsp">메인페이지로 돌아가자!</a>
</body>

</html>