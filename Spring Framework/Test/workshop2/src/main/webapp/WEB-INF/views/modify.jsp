<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value = "${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 정보 수정하기</title>

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

div {
	text-align: center;
}
</style>
<script>
	
</script>

</head>

<body>
	<h1>회원 정보 수정하기</h1>
	<form method="POST" action="${root}/user/modifySave" enctype="multipart/form-data">
		<div id="container">
			<label for="cnum">회원번호</label> <input type="text" name="cnum"
				value="${cus.cnum}" disabled="disabled" /> <input type="hidden"
				name="cnum" value="${cus.cnum}" /> <label for="userName">회원이름</label>
			<input type="text" name="username" value="${cus.username }"
				disabled="disabled" /> <label for="conts">관심사</label>
			<div>

				<input type="checkbox" name="conts" value="주식"
					${(fn:contains(cus.conts, '주식')) ? 'checked' : ''} /> 주식 <input
					type="checkbox" name="conts" value="펀드"
					${(fn:contains(cus.conts, '펀드')) ? 'checked' : ''} /> 펀드 <input
					type="checkbox" name="conts" value="예금"
					${(fn:contains(cus.conts, '예금')) ? 'checked' : ''} /> 예금 <input
					type="checkbox" name="conts" value="적금"
					${(fn:contains(cus.conts, '적금')) ? 'checked' : ''} /> 적금

			</div>
			<label for="uploadfile">이미지</label>
			<input type="file" name="uploadfile"/>

		</div>
		<div id="btn">
			<input type="reset" value="취소" /><input type="submit" value="수정하기" />
		</div>

	</form>
</body>

</html>