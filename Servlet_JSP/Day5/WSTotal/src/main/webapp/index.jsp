<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
#main {
	margin-top: 5px;
	display: flex;
	justify-content: space-between;
}

#main .main-item {
	display: inline-block;
	width: 33%;
}

#main .main-item img {
	width: 100%;
}

#main .main-item h2 {
	margin-top: 5px;
}

#main .main-item p {
	margin-top: 5px;
}

#main .main-item button {
	margin-top: 5px;
	padding: 5px;
	float: right;
	width: 80px;
	font-size: 18px;
}
</style>
<title>BNK 부산은행</title>
</head>
<body>
	<div id="container">
		<!-- navBar 로 대체 -->
		<jsp:include page="/navBar.jsp" flush="true" />

		<div id="banner"></div>
		<div id="main">
			<div class="main-item">
				<img src="https://picsum.photos/200" alt="">
				<h2>main-item 1</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
				<button class="main-item-btn">button 1</button>
			</div>
			<div class="main-item">
				<img src="https://picsum.photos/200" alt="">
				<h2>main-item 2</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
				<button class="main-item-btn">button 2</button>
			</div>
			<div class="main-item">
				<img src="https://picsum.photos/200" alt="">
				<h2>main-item 3</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
				<button class="main-item-btn">button 3</button>
			</div>
		</div>
		<jsp:include page="footer.jsp" />
	</div>
	<script type="text/javascript">
		window.onload = function() {
			setInterval(changeBanner, 3000);
		};
		let bannerList = [ "고객을 향한 단 하나의 진심, BNK 부산은행",
				"5060 웰컴패키지, 최대 7만원 혜택을 드립니다.", "타행이체, 자동이체 수수료 면제.",
				"저녁 6시까지 영업합니다." ];
		let bannerIndex = 0;

		function changeBanner() {
			// let banner = document.querySelector("#banner");
			banner.innerText = bannerList[bannerIndex++];
			if (bannerIndex == 4)
				bannerIndex = 0;
		}
	</script>
</body>
</html>