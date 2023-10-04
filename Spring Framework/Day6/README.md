# 2023.09.25

### Spring Boot

- MSA를 빠르고 쉽게 개발할 수 있도록 지원함.
- Java 기반의 오픈 소스 프레임워크인 Spring을 기반으로 한 웹 애플리케이션 프레임워크.
- 개발자가 복잡한 설정과 초기 구성 없이도 스프링 기반의 애플리케이션을 빠르게 구축할 수 있도록 지원함.
- 내장된 서버로 애플리케이션을 실행함.

### REST

- 하나의 URI는 하나의 고유한 리소스를 대표하도록 설계된다는 개념에 전송방식을 결합해서 원하는 작업을 요청한다.
- 웹의 장점을 최대한 활용할 수 있는 아키텍처
- HTTP URI를 통해 제어할 자원을 명시하고, HTTP Method를 통해 해당 자원을 제어하는 명령을 내리는 방식의 아키텍처
- Create → POST → @PostMapping
- Read → GET → @GetMapping
- Update → PUT → @PutMapping
- Delete → DELETE → @DeleteMapping

### REST의 구체적인 개념

- HTTP URI를 통해 자원을 명시하고, HTTP Method를 통해 해당 자원에 대한 CRUD Operation을 적용하는 것을 의미한다.
- 즉, REST는 자원 기반의 구조 설계의 중심에 Resource가 있고 HTTP Method를 통해 Resource를 처리하도록 설계된 아키텍쳐

### REST Annotation

- @PathVariable : URL 경로에 있는 값을 파라미터로 추출한다.
    - user/view/20과 같은 형식.
- @RestController : Controller가 REST 방식을 처리한다. ResponseBody를 포함한다.
- @ResponseBody : 결과를 데이터로 전달한다.
- @RequestBody : JSON 데이터를 원하는 타입으로 바인딩한다.

### RESTful한 API의 특징

- Client-Server 구조
- Stateless
- Cache 처리 가능
- Uniform Interface, 인터페이스 일관성
- Layered System, 계층화
- Code-on-demand, 서버가 네트워크를 통해 클라이언트에 전달한 프로그램을 클라이언트가 실행할 수 있어야 한다.

### **세부 규칙**

1. 슬래시 구분자 ( / )는 계층 관계를 나타내는데 사용한다.

2. URI 마지막 문자로 슬래시 ( / )를 포함하지 않는다.

- 즉 URI에 포함되는 모든 글자는 리소스의 유일한 식별자로 사용되어야 하며 URI가 다르다는 것은 리소스가 다르다는 것
- 역으로 리소스가 다르면 URI도 달라져야 한다.

3. 하이픈 ( - )은 URI 가독성을 높이는데 사용한다.

4. 밑줄 ( _ )은 URI에 사용하지 않는다.

5. URI 경로에는 소문자가 적합하다.

- URI 경로에 대문자 사용은 피하도록 한다.

6. 파일확장자는 URI에 포함하지 않는다.

- REST API 에서는 메시지 바디 내용의 포맷을 나타내기 위한 파일 확장자를 URI 안에 포함시키지 않는다.
- 대신 Accept Header 를 사용한다.
- ex) `GET`: `http://restapi.exam.com/orders/2/Accept: image/jpg`

7. 리소스 간에 연관 관계가 있는 경우

- /리소스명/리소스ID/관계가 있는 다른 리소스 명
- ex) GET: /users/2/orders (일반적으로 소유의 관계를 표현할 때 사용)

### 참고 문헌

- [https://velog.io/@somday/RESTful-API-이란](https://velog.io/@somday/RESTful-API-%EC%9D%B4%EB%9E%80)
