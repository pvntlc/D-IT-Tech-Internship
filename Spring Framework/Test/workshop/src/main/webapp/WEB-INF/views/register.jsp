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
	<h1>상품등록</h1>
	<form method="POST" action="${root}/register" enctype="multipart/form-data">
		<div id="container">
			<label for="pnum">기기번호</label>
			<input type="text" id="pnum"name="pnum" required /> 
			<label for="title">기기명</label>
			<input type="text" id="title"name="title" required /> 
			<label for="price">기기가격</label>
			<input type="number" id="price"name="price" required /> 
			<label for="quantity">입고수량</label>
			<input type="number" id="quantity"name="quantity" required /> 
			<label for="uploadfile">이미지</label>
			<input type="file" name="uploadfile"/>

		</div>
		<div id="btn">
			<input type="submit" value="상품등록" /><input type="reset" value="취소" />
		</div>

	</form>
</body>

</html>