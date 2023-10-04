<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="root" value = "${pageContext.request.contextPath }"/>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
</h1>
<c:forEach items>
${image}
${title}
${sub_title}
${start_date} ~ ${end_date}
</body>
</html>

/*
CREATE TABLE "SCOTT"."EVENT" 
   (    "SEQ" NUMBER, 
    "TITLE" VARCHAR2(100 BYTE), 
    "SUB_TITLE" VARCHAR2(100 BYTE), 
    "CONTENT" VARCHAR2(2000 BYTE), 
    "EVENT_TYPE" VARCHAR2(100 BYTE), 
    "SERVICE_TYPE" VARCHAR2(100 BYTE),
    "IMAGE" BLOB,
    "START_DATE" DATE,
    "END_DATE" DATE,
    "CREATED_AT" DATE,
    "MODIFIED_AT" DATE,
    "DELETED_AT" DATE
   );

CREATE SEQUENCE EVENT_SEQ;
*/