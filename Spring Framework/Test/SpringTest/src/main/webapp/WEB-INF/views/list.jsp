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
<title>USER-LIST</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="keywords" content="">
<style>
#searchWord{
float:right;
margin-bottom:15px;
}
</style>
<link rel="stylesheet" href="${root }/resources/assets/css/main.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">

$(function(){
	$("#searchWord").click(function(){
		var category = $("#category").val();
		if(category === "title"){
			var word= $("#word").val();
			location.href="${root}/list?word="+word+"&category="+category;
		}
		else{
			var word= $("#word").val();
			location.href="${root}/list?word="+word+"&category="+category;
		}
		
	});
	
	$(".title").mouseover(function(){
		var title=$(this).text();
		$.ajax({
		url : "${root}/getMemo",
		type : "get",
		data :{ title: title},
		dataType : "json",
		error : function(xhr, status,message){
		alert("error:"+message);
		},
		success : function(jsonData){
		$("#result").html(
		jsonData.memo);
		 }
		 }); });
	
	
 }); </script>
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
					<li><a href="${root}/loginView">Login</a></li>
					<li><a href="${root}/regView">Register</a></li>
					<li><a href="${root}/logout">Logout</a></li>
					<li><a href="${root }/list">User List</a></li>
					<li><a href="${root }/list">Notice List</a></li>
					<li><a href="${root }/regView">Register Notice</a></li>
				</ul>
			</nav>

	<!-- Heading -->
	<div id="heading">
		<h1>User List</h1>
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
						<c:if test="${not empty id}">
							${id}님 안녕하세요 <a href="${root}/user/logout">로그아웃</a>
						</c:if>
						<div class="table-wrapper">
						<div>
							원하는 부분을 검색하세요 !
						          <select id="category" name="category">
						            <option value="title">상품명</option>
						            <option value="boon">분류</option>
						          </select>
							<input type="text" id="word" value="${word }"></input>
							<button class="small" id="searchWord">검색</button>
							<br>
							
						</div>
							<table>
								<thead>
									<tr>
										<th>상품번호</th>
										<th>상품명</th>
										<th>상품분류</th>
										<th>이율</th>
										<th>삭제</th>
									</tr>
								</thead>
								<tbody>
								<form action="${root }/deleteAll" method="POST">
									<c:forEach var="n" items="${pos}">
										<tr>
											<td><span class="cnum">${n.code}</span></td>
											<td><span class="title"><a href="${root}/view?code=${n.code}">${n.title}</a></span></td>
											<td>${n.category}</td>
											<td>${n.rate}</td>
											<td>	<div class="col-6 col-12-small">
												<input type="checkbox" id="${n.code }" name="${n.code }">
												<label for="${n.code }"></label>
											</div></td>
										</tr>
									</c:forEach>
								
								</tbody>
							</table>
							<div id="result"></div>
							<a href="${root}/regView" >상품 등록</a>
							<a href="${root}" >메인페이지</a>
							<input type="submit" value="선택된 항목 삭제" >
							</form>
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
