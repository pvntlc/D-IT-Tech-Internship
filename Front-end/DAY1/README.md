# 2023.09.06

### 복습 :: JDBC API 구성

1. Driver
2. Connection : DB와 네트워크 연결.
3. Statement : 쿼리를 가져가서 실행하고 결과를 리턴한다.
    1. PreparedStatement : 쿼리를 미리 번역. 속도가 향상됨.
    2. CallableStatement : DBMS가 가지고 있는 함수를 실행.
4. ResultSet : 결과 값을 저장함.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/bd2afa16-7718-4f9b-94c3-1b5b741d45eb/Untitled.png)

→ 전부다 Interface, new 실행불가능.

### WEB Architecture

- HTTPd : HTTP를 서비스하는 서버
1. URL에 접속한다.
    1. 주소를 URL을 통해 입력한다.
    2. <a href=url>링크</a>를 통해 접근한다.
    3. <form action=url> submit 등을 통해 접근한다.
    4. javascript location.href=’url’을 통해 접근한다.
    5. window.open(o,url)을 통해 접근한다.
    6. ajax… etc..
2. 브라우저가 메세지를 만들어 HTTPd에 접속한다.
3. HTTPd가 HTTP프로토콜에 맞게 메세지를 해석하고 응답한다.
4. 만약 응답할 수 없다면, Web Container에 전달한다.
5. Web Container에서 클래스를 만들어 요청을 분석한다.
    1. Controller, Service, DAO, DTO..
6. 요청을 완수한 후 결과 페이지.jsp를 만들어 응답 형식에 맞게 바뀌어 전달된다.
7. 브라우저가 받은 내용을 해석하여 사용자에게 보여준다.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/891d352e-f377-43fe-9286-dda492f90b26/Untitled.png)

## HTML

- 줄바꿈이나 여러 개의 공백이 있어도 하나의 공백으로만 인식한다.
- pre 태그 사용하면 쓴 그대로 출력됨.

### FORM 태그

- TYPE = 입력상자 내용
- ID : 식별자, 자바 스크립트에서 사용
- NAME : 서버에 저장된 이름으로 입력값 전달
- CLASS : CSS에서 사용.
