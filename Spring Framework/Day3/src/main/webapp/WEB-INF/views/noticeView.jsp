<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>공지사항 상세 정보</h1>
회원번호 : ${cus.seq }<br/>
회원이름 : ${cus.writer}<br/>
관심사 : ${cus.cont }
<p/>
<a href ="${root }/notice/updateView?cnum=${cus.seq}">수정하기</a>
<a href ="${root }">메인페이지로</a>

</body>
</html>