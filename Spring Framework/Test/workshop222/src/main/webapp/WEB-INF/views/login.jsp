<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>로그인</title>

<style>
h1 {
	text-align: center;
}

#container {
	width: 300px;
	display: grid;
	grid-template-columns: 1fr 2fr;
	grid-gap: 5px 5px;
	margin: auto;
	margin-bottom: 10px;
}

#btn {
	text-align: center;
	margin: 5px;
}

label {
	background-color: lightgray;
	text-align: center;
}
</style>

</head>

<body>
	<h1>로그인</h1>
	<form method="POST" action="${root}/user/login">
		<div id="container">
			<label for="userName">아이디</label><input type="text" id="userName"
				name="userName" required /> <label for="pw">비밀번호</label><input
				type="password" id="pw" name="pw" />
		</div>
		<div id="btn">
			<input type="reset" value="취소" /><input type="submit" value="로그인" />
		</div>

	</form>
</body>

</html>