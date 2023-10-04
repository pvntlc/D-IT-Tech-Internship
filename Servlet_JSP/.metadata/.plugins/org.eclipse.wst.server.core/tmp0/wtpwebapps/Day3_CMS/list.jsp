<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		function del(cnum) {
			var result = confirm("정말 삭제하실건가요?");
			if(result){
				alert("삭제하겠습니다.");
				location.href="main.do?action=DEL&cnum=" + cnum;
			}else{
				alert("취소하였습니다.");
			}}
	</script>
</head>
<body>
	<h1>회원 목록</h1>
	<p>${userName }님</p>
	<table>
		<tr>
			<th>회원 번호</th>
			<th>회원 이름</th>
			<th>관심사</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="cu" items="${cusList}">
			<tr>
				<td>${cu.cnum}</td>
				<td><a href="main.do?action=VIEW&cnum=${cu.cnum} ">${cu.username}</td>
				<td>${cu.conts}</td>
				<td><a href="javascript:del(${cu.cnum })">삭제</td>
			</tr>
		</c:forEach>
	</table>
	<a href="index.jsp">메인페이지로 돌아가자!</a>
</body>
</html>