<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value = "${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">

$(function(){
	$(".pnum").click(function(){
	var cnum=$(this).text();
	$.ajax({
	url : "${root}/getQuantity?pnum=",
	type : "get",
	data :{ quantity: quantity},
	dataType : "json",
	error : function(xhr, status,message){
	alert("error:"+message);
	},
	success : function(jsonData){
		 const quantity = jsonData.quantity;
         const resultDiv = $("#result");

         if (quantity > 0) {
             resultDiv.html("상품 수량: " + quantity + "개 남았습니다.");
         } else {
             resultDiv.html("재고가 없습니다.");
         }
	 }
	 }); }); }); 
	 
	 </script>

<style>
    table {
        border-collapse: collapse;
        width: 300px;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: center;
    }
    .green-bg {
        background-color: lightgreen; /* Set background color for specific cells */
    }
    td:first-child {
        width: 200px; /* Fixed width for the image cell */
    }
</style>
</head>
<body>
<h1>상품 상세 정보</h1>
<table>
    <tr>
        <td rowspan="3">
            <img src="${root}/resources/img/${phones.pimg}" alt="이미지 설명" style="max-width: 100%; height: auto;">
        </td>
        <td class="green-bg">상품 번호</td>
        <td>${phones.pnum}</td>
    </tr>
    <tr>
        <td class="green-bg">이름</td>
        <td>${phones.title}</td>
    </tr>
    <tr>
        <td class="green-bg">가격</td>
        <td>${phones.price}<span class="pnum">재고 수량 확인</span></td>
    </tr>
</table>
<div id="result"></div>
<a href="${root}">메인페이지로</a>
</body>
</html>