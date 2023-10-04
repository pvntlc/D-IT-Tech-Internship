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
<title>Elements - Industrious by TEMPLATED</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="keywords" content="">
<link rel="stylesheet" href="assets/css/main.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
function getImg(cnum){
fetch("${root}/user/getImg?cnum=" +cnum)
.then((response) => response.json())
.then(jsonData => {
$("#result").html(
"<img src='${root}/resources/img/"+jsonData.imgInfo+"'/>");
 });
}

$(function(){
	$(".cnum").mouseover(function(){
	var cnum=$(this).text();
	$.ajax({
	url : "${root}/user/getImg",
	type : "get",
	data :{ cnum: cnum},
	dataType : "json",
	error : function(xhr, status,message){
	alert("error:"+message);
	},
	success : function(jsonData){
	$("#result").html(
	"<img src='${root}/resources/img/"+jsonData.imgInfo+"' />");
	 }
	 }); }); }); </script>
</head>
<body class="is-preload">

	<!-- Header -->
	<header id="header">
		<a class="logo" href="index.html">Industrious</a>
		<nav>
			<a href="#menu">Menu</a>
		</nav>
	</header>

	<!-- Nav -->
	<nav id="menu">
		<ul class="links">
			<li><a href="index.html">Home</a></li>
			<li><a href="elements.html">Elements</a></li>
			<li><a href="generic.html">Generic</a></li>
		</ul>
	</nav>

	<!-- Heading -->
	<div id="heading">
		<h1>Elements</h1>
	</div>

	<!-- Main -->
	<section id="main" class="wrapper">
		<div class="inner">
			<div class="content">

				<!-- Elements -->
				<div class="row">
					<div class="col-6 col-12-medium">

						<!-- Table -->
						<h3>유저 리스트</h3>
						<h4>현재 가입되어 있는 유저들을 확인하세요 !</h4>
						<div class="table-wrapper">
							<table>
								<thead>
									<tr>
										<th>유저번호</th>
										<th>유저이름</th>
										<th>관심사</th>
										<th>삭제</th>
										<th>이미지 파일</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="n" items="${cus}">
										<tr>
											<td><span class="cnum">${n.cnum}</span></td>
											<td><a href="${root}/user/view?cnum=${n.cnum}">${n.username}</td>
											<td>${n.conts}</td>
											<td><a href="${root}/user/delete?cnum=${n.cnum}">삭제</td>
											<td><a href="javascript:getImg(${n.cnum})">${n.imgInfo }</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div id="result"></div>
						</div>

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
					<h3>Accumsan montes viverra</h3>
					<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing
						gravida odio porttitor sem non mi integer non faucibus ornare mi
						ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien
						lorem accumsan varius montes viverra nibh in adipiscing. Lorem
						ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum.
						Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed
						feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia
						ante nunc ac gravida.</p>
				</section>
				<section>
					<h4>Sem turpis amet semper</h4>
					<ul class="alt">
						<li><a href="#">Dolor pulvinar sed etiam.</a></li>
						<li><a href="#">Etiam vel lorem sed amet.</a></li>
						<li><a href="#">Felis enim feugiat viverra.</a></li>
						<li><a href="#">Dolor pulvinar magna etiam.</a></li>
					</ul>
				</section>
				<section>
					<h4>Magna sed ipsum</h4>
					<ul class="plain">
						<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
						<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
						<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
						<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
					</ul>
				</section>
			</div>
		</div>
	</footer>

	<div id="copyright " class="copyright">
		Design by <a href="https://templated.co/">TEMPLATED</a>.
	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>
