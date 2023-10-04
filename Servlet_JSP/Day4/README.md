# 2023.09.14

# **9월 14일 수업 목표**

1. JSP 흐름을 정리해 보자
2. Web Architecture를 정리해 보자
3. Web Architecture에 따른 실습

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/563f83ca-0696-47f7-8adb-e3c1f688a866/Untitled.png)

### JSP 흐름 정리

1. Script : HTML Page + <% java %>
    - <%@ page 페이지 정보 설정 %>
    - <%@ taglib taglibrary 사용 %>
    - <%@ include file=”~.jsp” %>
    - <%! type 멤버변수 = 값;  %> → 멤버변수 및 메소드 선언
    - <%  java code, servlet 객체 사용 등.. request, response, session, application 사용 가능 %>
    - <%= 출력 내용들 넣기, 연산식도 가능. 다만 세미콜론 넣으면 안 됨. %>
    - <%— 주석 —%>
2. Tag
    - Custom tag : 개발자가 임의로 클래스를 만들어 태그를 만드는 것.
    - Action tag
    - <jsp: include page=”url”> == requestDispatcher
    - <jsp:forward page=”  “/> == requestDispatcher
3. JSTL(JSP Standard Tag Library)
EL(Expression Language)
    - ${cu.username} 과 같이 ${변수 or 수식 or 메소드 호출}
    - 라이브러리 파일 설정
    - <%@taglib uri=” ” prefix = “c“ %>
    - <c:if test = “ “></c:if>
    - <c:set var=”변수명” value =”값”/>
    - <c:forEach items=”data” var=”변수”>

### 웹 클라이언트-서버 동작 방식
