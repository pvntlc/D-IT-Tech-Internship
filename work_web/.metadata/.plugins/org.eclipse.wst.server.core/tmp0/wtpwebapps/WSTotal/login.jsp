<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />
	<meta http-equiv="pragma" content="no-cache" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${root}/css/basic.css">
  <link rel="stylesheet" href="${root}/css/navbar.css">
  <style>

    #login {
      margin-top: 5px;
      padding: 20px 0px;
    }

    #login h1 {
      padding: 5px;
      text-align: center;
    }

    #login form{
      display: block; 
      width: 100%;
      height: 200px;
      border: 1px solid lightgrey;
      padding: 40px;
    }

    #login .form-item{
      margin-bottom: 10px;
    }

    #login .form-item label{
      display: inline-block;
      width: 100px;
      font-size: 18px;
    }

    #login .form-item input{
      display: inline-block;
      width: 200px;
      font-size: 18px;
    }

    #login button{
      margin-top: 10px;
      padding: 5px;
      float: right;
      width: 80px;
      font-size: 18px;
    } 
  </style>
  <title>BNK 부산은행 - login</title>
</head>
<body>
  <div id="container">
  
    <!-- navBar 로 대체 -->
  	<jsp:include page="/navBar.jsp" flush="true"/>
  	
    <div id="banner">고객을 향한 단 하나의 진심, BNK 부산은행</div>
    <div id="login">
      <h1>Login</h1>
		<form action="${root}/user.do?action=LOGIN"  method="POST">
        <div class="form-item">
          <label for="user">아이디</label>
		      <input type="text" id="user"  name="user"/>
        </div>

        <div class="form-item">
          <label for="password">비밀번호</label>
		      <input type="password" id="password" name ="password">
        </div>

        <hr>
        <input  type='reset'  value="취 소" />
        <input  type='submit'  value="로그인" />
		</form>
    </div>
   <jsp:include page="footer.jsp"/>
  </div>
 
</body>
</html>