<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>계좌등록</title>
<style>
#container {
	display: flex;
	justify-content: center;
	margin-top: 50px;
}

form {
	width: 500px;
	border-radius: 20px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.19), 0 6px 6px
		rgba(0, 0, 0, 0.23);
	padding: 3%;
}

#back-btn {
	background-color: white;
	border: none;
	cursor: pointer;
}

#banner {
	width: 100%;
	text-align: center;
}

.form-item {
	margin-bottom: 30px;
}

.form-item label {
	width: 100px;
	height: 50px;
	font-size: medium;
}

form input {
	width: 100%;
	border-color: lightgrey;
	border-style: solid;
	border-radius: 10px;
	height: 30px;
}

form input:focus {
	border-width: 3px;
	border-color: #555;
	outline: none;
}

#cont {
	width: 100%;
	border-width: 2px;
	border-color: lightgrey;
	border-style: solid;
	border-radius: 10px;
	height: 150px;
	resize: none;
	outline-color: #555;
}

#form-btn-container {
	display: flex;
	justify-content: space-between;
}

.form-checkbox {
	margin-bottom: 30px;
	display: flex;
}

.form-checkbox input {
	white-space: nowrap;
}

.div-checkbox {
	display: flex;
	align-items: center;
	margin-right: 20px;
}

#conts {
	width: 20px;
	height: 20px;
}

.form-btn {
	height: 50px;
	width: 45%;
	border: none;
	border-radius: 10px;
	cursor: pointer;
	font-weight: bolder;
	opacity: 1;
	-webkit-transition: .3s ease-in-out;
	transition: .3s ease-in-out;
}

.form-btn:hover {
	opacity: .5;
}

.form-btn[type=submit] {
	color: white;
	background-color: #555;
}
</style>
<script>
	function goBack() {
		window.history.back();
	}
	function validatePassword() {
		if (password.value == password_check.value) {
			return true;
		} else {
			alert("비밀번호가 일치하지 않습니다.");
			password_check.focus();
			return false;
		}
	}
</script>
</head>

<body>
	<div id="container">
		<form action="account.do?action=REGIST" method="post">
			<button type="button" id="back-btn" onclick="javascript:goBack()">&lt;</button>
			<h2 id="banner">계좌등록</h2>
			<div class="form-item">
				<label for="aseq">계좌번호</label> 
				<input type="text" id="aseq"
					name="aseq" maxlength="20" required />
			</div>
			<div class="form-item">
				<label for="cseq">고객번호</label> 
				<input type="number" id="cseq"
					name="cseq" maxlength="10" required />
			</div>
			<div class="form-item">
				<label for="pseq">상품번호</label> 
				<input type="number" id="pseq"
					name="pseq" maxlength="10" required />
			</div>
			<div class="form-item">
				<label for="balance">잔액</label> 
				<input type="number" id="balance"
					name="balance" maxlength="11" required />
			</div>
			<div class="form-item">
				<label for="password">비밀번호</label> 
				<input type="password" id="password"
				placeholder="6자리 숫자를 입력해주세요."
					name="password" minlength="6" maxlength="6" required />
			</div>
			<div id="form-btn-container">
				<input class="form-btn" type="reset" value="초기화" /> <input
					class="form-btn" type="submit" value="계좌등록" 
					onclick="return confirm('정말로 계좌를 등록하시겠습니까?')"/>
			</div>
		</form>
	</div>
</body>

</html>