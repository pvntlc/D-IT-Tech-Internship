# 2023.09.12

# **9월 12일 학습 목표**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/bac0ad01-058a-44cb-ab15-6e14ab65311e/Untitled.png)

1. JSP 페이지 구조
2. Scriptlet
3. JSTL / EL
4. 페이지 이동 방법들

### JSP

- Script
- JSP 페이지 구조
- EL, JSTL.

```java
<%!//선언문
	int k = 10;
	

	public void m() {
		System.out.println("mmm");
	}%>

	<%
	//서비스 메소드로 해석됨. Scriptlet
	
	
	
	for (int i = 0; i < 5; i++) {
		
		out.println(i + " : for문입니다.</br>");
	}
	
	out.println("그냥 입출력입니다.");
	m();
	k+=Math.random()*50;
	%>
	<h1>k값을 출력</h1>
	<%=k%>

	<%--주석주석 하주석--%>
	
	<a href="second.jsp?num=5&user=pvntic">다음 페이지로</a>
```

<%!>는 한번만 실행, 멤버변수 선언문.

<% %>는 서비스 불릴 때마다 계속 실행.

<%= %> 출력문에서 사용됨.

JSP는 결국 서블릿이다 !

### <%@**taglib** %>

- 

<%@**include** file=*"header.jsp"*%> <!--  코드를 포함해서 컴파일 -->

<**jsp:include** page=*"header.jsp"*> <!--  실행결과를 포함해서 컴파일 -->

<%@**taglib** %>

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/2938df31-e3f8-4ab7-998c-4c42337bc24d/Untitled.png)

eol 쓸 때

1. request
2. session
3. application
