<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 등록</title>

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

</head>
<body>
	<H1>정보 수정하기</H1>
	<form method="POST" action="user.do?action=MODIFYSAVE">
		<div id="container">
			<label for="useq">고객번호</label><input type="text" id="useq" name="useq" disabled="disabled" value="${ul.useq }" />
			<input type="hidden" id="useq" name="useq" value="${ul.useq}">
			<label for="name">고객이름</label><input type="text" id="name" name="name" required />
			<label for="email">이메일</label><input type="text" id="email" name="email" required />
			<label for="phone">핸드폰 번호</label><input type="text" id="phone" name="phone" required />
			
			</div>
		<div id="btn">
			<input type="reset" value="취소" /><input type="submit" value="수정 완료" />
		</div>

	</form>

</body>
</html>