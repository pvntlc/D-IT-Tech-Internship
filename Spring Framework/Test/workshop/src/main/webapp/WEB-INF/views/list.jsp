<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디카페인 아메리카노 칸타타</title>
<style>
body {
	color: #666;
	font: 14px/24px "Open Sans", "HelveticaNeue-Light",
		"Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial,
		"Lucida Grande", Sans-Serif;
}

table {
	border-collapse: separate;
	border-spacing: 0;
	width: 100%;
}

th, td {
	padding: 6px 15px;
}

th {
	background: #42444e;
	color: #fff;
	text-align: center;
}

tr:first-child th:first-child {
	border-top-left-radius: 6px;
}

tr:first-child th:last-child {
	border-top-right-radius: 6px;
}

td {
	border-right: 1px solid #c6c9cc;
	border-bottom: 1px solid #c6c9cc;
}

td:first-child {
	border-left: 1px solid #c6c9cc;
}

tr:nth-child(even) td {
	background: #eaeaed;
}

tr:last-child td:first-child {
	border-bottom-left-radius: 6px;
}

tr:last-child td:last-child {
	border-bottom-right-radius: 6px;
}
</style>
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

<body>
	<table>
		<thead>
			<tr>
				<th>기기번호</th>
				<th>기기이름</th>
				<th>가격</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="n" items="${phones}">
				<tr>
					<td>${n.pnum}</td>
					<td><a href="${root}/view?pnum=${n.pnum}">${n.title}</td>
					<td>${n.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="${root}">메인 페이지로 !</a>
	<a href="${root}">추가 등록</a>
</body>

</html>