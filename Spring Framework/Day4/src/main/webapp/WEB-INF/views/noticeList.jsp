<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디카페인 아메리카노 먹고 싶어요</title>
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
h1{
text-align : center;
}
</style>
<script type="text/javascript">
	function del(cnum) {
		var result = confirm("정말 삭제하실건가요?");
		if (result) {
			alert("삭제하겠습니다.");
			location.href = "main.do?action=DEL&cnum=" + cnum;
		} else {
			alert("취소하였습니다.");
		}
	}
</script>
</head>
<body>
	<h1>공지사항 목록</h1>
	<table>
		<tr>
			<th>게시글 번호</th>
			<th>제목</th>
			<th>작성날짜</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="nos" items="${nos}">
			<tr>
				<td><a href="${root}/notice/view?cnum=${nos.seq} ">
						${nos.seq}</td>
				<td>${nos.title}</td>
				<td>${nos.createdat}</td>
				<td><a href="${root }/notice/delete?cnum=${nos.seq} "> 삭제</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${root }">메인페이지로 돌아가자!</a>
</body>
</html>