<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE HTML>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
<head>
<title>UPDATE-USER</title>
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
		<a class="logo" href="${root }/">BNK 부산은행</a>
		<nav>
			<a href="#menu">Menu</a>
		</nav>
	</header>

	<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="${root }/">Home</a></li>
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
						<form method="post" action="${root}/user/modifySave"
							enctype="multipart/form-data">
							<div class="row gtr-uniform">
							
								<div class="col-6 col-12-xsmall">
									<input type="text" name="cnum" id="cnum" value="${cus.cnum}"
										placeholder="ID" disabled="disabled" >
									<input type="hidden" name="cnum" value="${cus.cnum}" /> 
								</div>
								
								<div class="col-6 col-12-xsmall">
									<input type="text" name="username" id="username" value="${cus.username }"
										placeholder="ID" disabled="disabled">
								</div>
								
								<!-- Break -->
								<div class="col-6 col-12-small">
									<input type="checkbox" id="checkbox-alpha" name="conts"
										value="주식" ${(fn:contains(cus.conts, '주식')) ? 'checked' : ''} > <label for="checkbox-alpha">무식</label>
								</div>
								<div class="col-6 col-12-small">
									<input type="checkbox" id="checkbox-beta" name="conts"
										value="펀드" ${(fn:contains(cus.conts, '펀드')) ? 'checked' : ''}> <label for="checkbox-beta">펀드</label>
								</div>
								<div class="col-6 col-12-small">
									<input type="checkbox" id="checkbox-gamma" name="conts"
										value="예금" ${(fn:contains(cus.conts, '예금')) ? 'checked' : ''}> <label for="checkbox-gamma">예금</label>
								</div>
								<div class="col-6 col-12-small">
									<input type="checkbox" id="checkbox-theta" name="conts"
										value="적금" ${(fn:contains(cus.conts, '적금')) ? 'checked' : ''}> <label for="checkbox-theta">적금</label>
								</div>
								<div class="col-6 col-12-small">
									<label for="uploadfile">이미지</label> <input type="file"
										name="uploadfile" />
								</div>
								<!-- Break -->
								<div class="col-12">
									<ul class="actions">
										<li><input type="submit" value="Submit Form"
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
