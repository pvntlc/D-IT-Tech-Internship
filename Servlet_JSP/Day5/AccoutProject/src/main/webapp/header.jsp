<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BNK 부산은행 계좌 서비스</title>
<style>
nav {
	width: 100%;
	/*  너비 */
	height: 80px;
	/* 높이 */
}

#navbar a {
	text-decoration: none;
	color: black;
}

nav a:hover {
	text-decoration: underline;
	color: #cb2b11;
	font-weight: bold;
}

#navbar ul {
	padding-left: 0;
	list-style: none;
}

#logo_img {
	width: 180px;
	height: 50px;
}

#navbar {
	display: flex;
	align-items: center;
	list-style-type: none;
	padding: 0;
	justify-content: space-between;
}

#navbar .left {
	margin-right: auto;
}

#navbar li {
	display: flex;
	margin-left: 5px;
}

#navbar>li>a {
	display: block;
	font-size: 17px;
	font-weight: bold;
	padding: 10px 20px;
	height: 50px;
	line-height: 50px;
	align-items: center;
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
	margin-bottom: 0px;
}

#navbar>li>a:hover {
	text-decoration: underline;
}

#navbar #userName {
	white-space: nowrap;
	font-weight: normal;
	font-size: 13px;
}

#navbar #logout {
	font-weight: normal;
	font-size: 13px;
}

#navbar #logout:hover {
	color: #cb2b11;
}

#profile {
	display: flex;
	font-size: 17px;
	align-items: center;
	padding: 10px 0px;
	padding-left: 30px;
	height: 50px;
	line-height: 50px;
}

#profileImg {
	width: 40px;
	height: 40px;
}

#nav-divider {
	position: absolute;
	left: 0;
	width: 100%;
	height: 2px;
	background-color: #cb2b11;
}
</style>
</head>
<body>
	<div id="main-container">
		<nav>
			<ul id="navbar">
				<li class="left"><a href="index.jsp"> <img id="logo_img"
						src="img/logo.jpg" />
				</a></li>
				<li><a href="account.do?action=LIST">계좌목록</a></li>
				<li><a href="regist.jsp">계좌등록</a></li>
			</ul>
		</nav>
		<div id="nav-divider"></div>
	</div>
</body>
</html>