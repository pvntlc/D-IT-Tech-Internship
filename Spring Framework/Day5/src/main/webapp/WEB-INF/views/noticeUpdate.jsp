<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<title>UPDATE-NOTICE</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="keywords" content="">
<link rel="stylesheet" href="${root}/resources/assets/css/main.css">
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
	<!-- Heading -->
	<div id="heading">
		<h1>Register</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">

				<!-- Elements -->
				<div class="row">
					<div class="col-6 col-12-medium">

						<!-- Form -->
						<h3>Form</h3>
						<form method="post" action="${root }/notice/update"
							enctype="multipart/form-data">
							<input type="hidden" id="cnum" name="cnum" value="${nos.seq }"/>
							<div class="row gtr-uniform">
								<div class="col-6 col-12-xsmall">
									<input type="text" name="title" id="title" value="${nos.title }"
										placeholder="ID">
								</div>
								<!-- Break -->

								<div class="col-12">
									<textarea name="cont" id="cont" placeholder="Contents" rows="6">${nos.cont }</textarea>
								</div>
								<!-- Break -->
								<div class="col-12">
									<ul class="actions">
										<li><input type="submit" value="Submit"
											class="primary"></li>
										<li><input type="reset" value="Reset"></li>
									</ul>
								</div>
							</div>
						</form>

					</div>
				</div>
			</div>
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
