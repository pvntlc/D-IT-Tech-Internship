<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BNK 부산은행 계좌 서비스</title>
<style>
body {
	text-align: center;
}

h1 {
	font-size: 40px;
	color: #333333;
	font-weight: 600;
	text-align: center;
}

#main-container {
	display: block;
	width: 100%;
	margin-bottom: 50px;
}

#main-content {
	display: flex;
	margin: auto;
}

#banner-title {
	margin-top: 50px;
}

#intership-video {
	margin-top: 50px;
}
</style>
<script>
	function changeScroll() {
		var iframe = document.getElementById('bnk-homepage');
		iframe.contentWindow.scrollTo(0, 50);
	}
</script>
</head>
<body onload="changeScroll()">
	<div id="main-container">
		<div>
			<div>
				<h1>BNK 부산은행</h1>
				<div id="main-content">
					<img src="img/bnk_character2.jpg" />
					<iframe id="intership-video" width="1120" height="630"
						src="https://www.youtube.com/embed/c7AoeK7Jros?si=MrWn_ErL2a_FHk0c"
						title="YouTube video player" frameborder="0"
						allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
						allowfullscreen> </iframe>
					<img src="img/bnk_character3.jpg" />
				</div>
			</div>
		</div>

	</div>
</body>
</html>