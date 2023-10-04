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

</script>
</head>

<body>
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
	<a href="${root}">메인 페이지로 !</a>
</body>

</html>