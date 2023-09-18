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
	function confirmDeposit() {
		var moneyInput = document.getElementById('money');
		var depositAmount = moneyInput.value;

		if (depositAmount.length === 0) { // 수정: length()가 아니라 length로 수정
			alert("입금액을 입력해주세요.");
			return false; // 입금액이 비어있을 때는 확인 대화상자를 표시하지 않음
		}

		return confirm('정말로 ' + depositAmount + '원을 입금하시겠습니까?');
	}
</script>
</head>

<body>
	<div id="container">
		<form action="account.do?action=DEPOSITSAVE" method="post">
			<button type="button" id="back-btn" onclick="javascript:goBack()">&lt;</button>
			<h2 id="banner">입금하기</h2>
			<div class="form-item">
				<label for="aseq">계좌번호</label>
				<div id="aseq" name="aseq">${aseq}</div>
			</div>
			<div class="form-item">
				<label for="money">입금액</label> <input type="number" id="money"
					name="money" maxlength="11" required />
			</div>
			<div id="form-btn-container">
				<input class="form-btn" type="reset" value="초기화" /> <input
					class="form-btn" type="submit" value="입금하기"
					onclick="return confirmDeposit()" />
			</div>
		</form>
	</div>
</body>

</html>