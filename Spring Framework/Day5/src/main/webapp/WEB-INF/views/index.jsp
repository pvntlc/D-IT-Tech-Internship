<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value = "${pageContext.request.contextPath }"/>
<!DOCTYPE HTML>
<html>
	<head>
		<title>BNK 부산은행</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
		<meta name="description" content="">
		<meta name="keywords" content="">
		<link rel="stylesheet" href="${root }/resources/assets/css/main.css">
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
		<a class="logo" href="${root }">BNK 부산은행</a>	
				<nav>
					<a href="#menu">Menu</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="${root }">Home</a></li>
					<c:if test="${empty userName }">
					<li><a href="${root}/user/loginView">Login</a></li>
					<li><a href="${root}/user/regView">Register</a></li>
					</c:if>
					<c:if test="${not empty userName }">
					<li><a href="${root}/user/logout">Logout</a></li>
					<li><a href="${root }/user/list">User List</a></li>
					<li><a href="${root }/notice/list">Notice List</a></li>
					<li><a href="${root }/notice/regView">Register Notice</a></li>
					</c:if>
				</ul>
			</nav>

		<!-- Banner -->
			<section id="banner">
				<div class="inner">
					<h1>BUSAN IS READY</h1>
					<p>WORLD EXPO 2030 BUSAN, KOREA <a href="https://templated.co/">KOREA</a>BNK wishes to host the 2030 Busan World Expo.</p>
				</div>
				<video autoplay loop muted playsinline src="images/banner.mp4"></video>
			</section>

		<!-- Highlights -->
			<section class="wrapper">
				<div class="inner">
					<header class="special">
						<h2>BNK Web Application</h2>
						<p>I worked hard to make it during my internship. I worked hard to make it during my internship. I worked hard to make it during my internship.</p>
					</header>
					<div class="highlights">
					<c:if test="${empty userName }">
						<section>
							<div class="content">
								<header>
									<a href="${root}/user/loginView" class="icon fa-vcard-o"><span class="label">Icon</span></a>
									<h3>로그인</h3>
								</header>
								<p>Please LOGIN There may be an error, but please let me off just this once.</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="${root}/user/regView" class="icon fa-files-o"><span class="label">Icon</span></a>
									<h3>회원가입</h3>
								</header>
								<p>Please REGISTER There may be an error, but please let me off just this once.</p>
							</div>
						</section>
						</c:if>
						<c:if test="${not empty userName }">
						<section>
							<div class="content">
								<header>
									<a href="${root}/user/logout" class="icon fa-floppy-o"><span class="label">Icon</span></a>
									<h3>로그아웃</h3>
								</header>
								<p>Please LOGOUT There may be an error, but please let me off just this once.</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="${root }/notice/list" class="icon fa-line-chart"><span class="label">Icon</span></a>
									<h3>공지사항 리스트 보기</h3>
								</header>
								<p>Please view NOTICELIST There may be an error, but please let me off just this once.</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="${root}/user/list" class="icon fa-paper-plane-o"><span class="label">Icon</span></a>
									<h3>유저 리스트 보기</h3>
								</header>
								<p>Please VIEW USERLIST There may be an error, but please let me off just this once.</p>
							</div>
						</section>
						<section>
							<div class="content">
								<header>
									<a href="${root }/notice/regView" class="icon fa-qrcode"><span class="label">Icon</span></a>
									<h3>공지사항 등록하기</h3>
								</header>
								<p>Please REGISTER NOTICE There may be an error, but please let me off just this once.</p>
							</div>
						</section>
						</c:if>
					</div>
				</div>
			</section>

		<!-- CTA -->
			<section id="cta" class="wrapper">
				<div class="inner">
					<h2>BNK D-IT TECH INTERNSHIP</h2>
					<p>I think everyone can be transferred to a full-time job.  </p>
				</div>
			</section>


		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<div class="content">
						<section>
							<h3>BNK BNK BNK</h3>
							<p>Hello, something delicious came out for lunch today. Do you know what came out yesterday? I'm not sure either. I hope that something delicious will come out in the future. Fighting, everyone!</p>
						</section>
						<section>
							<h4></h4>
							<ul class="alt">
								<li><a href="#">Pingu.</a></li>
								<li><a href="#">Pinga.</a></li>
								<li><a href="#">Noob Noob.</a></li>
								<li><a href="#">Pingy.</a></li>
							</ul>
						</section>
						<section>
							<h4>One Piece Pirates</h4>
							<ul class="plain">
								<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>ACE</a></li>
								<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>NEWGATE</a></li>
								<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>MARCO</a></li>
								<li><a href="#"><i class="icon fa-github">&nbsp;</i>VSTA</a></li>
							</ul>
						</section>
					</div>
				</div>
			</footer>

		<div id="copyright " class="copyright">
			Design by <a href="https://templated.co/">TEMPLATED</a>.
		</div>

		<!-- Scripts -->
			<script src="${root }/resources/assets/js/jquery.min.js"></script>
			<script src="${root }/resources/assets/js/browser.min.js"></script>
			<script src="${root }/resources/assets/js/breakpoints.min.js"></script>
			<script src="${root }/resources/assets/js/util.js"></script>
			<script src="${root }/resources/assets/js/main.js"></script>

	</body>
</html>
