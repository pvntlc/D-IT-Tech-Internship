<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공지사항 수정하기</title>

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
	<h1>공지사항 수정하기</h1>
	<form method="POST" action="Notice.do?action=MODIFYSAVE">
		<div id="container">
			<label for="cnum">게시글번호</label> <input type="text" name="seq"
				value="${nos.seq}" disabled="disabled" /> 
				<input type="hidden" name="seq" value="${nos.seq}" /> 
			<label for="writer">작성자</label>
			<input type="text" name="writer" value="${nos.writer }"	disabled="disabled" />
			<label for="title">제목</label>
			<input type="text" name="title" value="${nos.title }" /> 
			<label for="conts">내용</label>
			<textarea id="conts" name="conts" rows="4" required>${nos.cont }</textarea><br><br>
		</div>
		<div id="btn">
			<input type="reset" value="취소" /><input type="submit" value="수정하기" />
		</div>

	</form>
</body>

</html>