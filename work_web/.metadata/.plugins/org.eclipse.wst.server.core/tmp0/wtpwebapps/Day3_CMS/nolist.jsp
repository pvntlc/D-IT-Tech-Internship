<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디카페인 아메리카노 먹고 싶어요</title>
<style>
td {
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
				<td><a href="Notice.do?action=LIST&cnum=${nos.seq} ">
						${nos.seq}</td>
				<td>${nos.title}</td>
				<td>${nos.createdat}</td>
				<td><a href="Notice.do?action=DELETE&cnum=${nos.seq} "> 삭제</td>
			</tr>
		</c:forEach>
	</table>
	<a href="index.jsp">메인페이지로 돌아가자!</a>
</body>
</html>