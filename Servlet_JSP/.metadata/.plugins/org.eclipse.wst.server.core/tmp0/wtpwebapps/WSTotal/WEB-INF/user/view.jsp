<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 상세 정보</title>
</head>
<body>
<h1>개인 상세 정보</h1>
고객번호 : ${ul.useq}<br/>
고객이름 : ${ul.name}<br/>
이메일 : ${ul.email}<br/>
핸드폰 번호 : ${ul.phone}<br/>

<p/>
<a href ="user.do?action=MODIFYVIEW&useq=${ul.useq}">수정하기</a>
<a href ="index.jsp">메인페이지로</a>
</body>
</html>