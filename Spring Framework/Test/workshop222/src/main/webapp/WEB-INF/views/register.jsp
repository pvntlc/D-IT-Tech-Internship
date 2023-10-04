<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원가입</title>

<style>
h1 {
	text-align: center;
}

#container {
	width: 400px;
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
<script>
	function check() {
		if (pw.value === pw2.value) {
			alert("비밀번호가 일치합니다 !");
		} else {
			alert("비밀번호가 일치하지 않습니다.");
			pw2.focus();
		}
	};
</script>

</head>

<body>
	<h1>회원 가입</h1>
	<form method="POST" action="${root}/user/register3" enctype="multipart/form-data">
		<div id="container">
			<label for="userName">회원이름</label><input type="text" id="userName"
				name="userName" required /> <label for="pw">비밀번호</label><input
				type="password" id="password" name="password" minlength="6" /> <label for="pw2">비밀번호
				확인</label>
			<div>
				<input type="password" id="pw2" name="pw2" minlength="6" /> <a
					href="javascript:check()">확인</a>
			</div>
			<label for="conts">관심사</label>
			<div>
				<input type="checkbox" name="conts" value="주식" /> 무식 <input
					type="checkbox" name="conts" value="펀드" /> 펀드 <input
					type="checkbox" name="conts" value="예금" /> 예금 <input
					type="checkbox" name="conts" value="적금" /> 적금
			</div>
			<label for="uploadfile">이미지</label>
			<input type="file" name="uploadfile"/>

		</div>
		<div id="btn">
			<input type="reset" value="취소" /><input type="submit" value="회원가입" />
		</div>

	</form>
</body>

</html>