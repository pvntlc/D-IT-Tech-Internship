# 2023.09.18

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/3e17f3d6-659d-40c1-b832-277781a6b4eb/Untitled.png)

### 설계 지침

- Cohesion : 하나의 클래스는 하나의 목적에 맞게끔
- Coupling : 클래스들간의 연관성

→ Cohesion은 높게, Coupling은 낮게 만들어야 함 ! 따라서 Interface 만듦.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/47f1b549-3d49-4b52-b105-bc0aec58b7ed/Untitled.png)

### Spring framework 장단점

1. 웹 개발을 편하게 해준다.
2. 라이브러리를 다 쪼개서 사용하므로 경량화, 가볍게 사용 가능함.
3. Coupling이 줄어들어 유지보수성, 확장성이 증가한다.
4. 자동화되어 있어 좀 더 빠른 개발이 가능하다.
5. 학습이 필요하다.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/37263440-f203-4483-8f29-c413eb67655b/Untitled.png)

### 의존성 주입

- 생성관리 및 객체관리를 담당하는 Spring DI 혹은 IOC
    - Factory, Singleton
- Controller는 DI에게 객체를 요구하고, DI는 객체를 전달한다.
- 생성자 설정과 프로퍼티 설정으로 주입할 수 있다.
- 생성자 설정을 통한 DI
    
    ```java
    public class BoardService {
    	private BoardDao boardDao;
    	public BoardService(BoardDao boardDao) {
    		this.boardDao = boardDao;
    	}
    }
    
    <bean id="boardService" class="exam.bean.BoardService">
    <constructor-arg ref="boardDao"></constructor-arg>
    </bean>
    <bean id="boardDao" class="exam.bean.BoardDao"></bean>
    ```
    
- 프로퍼티를 통한 DI
    
    ```java
    public class BoardService {
    	private BoardDao boardDao;
    	public void setBoardDao(BoardDao boardDao) {
    		this.boardDao = boardDao;
    	}
    }
    
    <bean id="boardService" class="exam.bean.BoardService">
    <property ref="boardDao“ />
    </bean>
    <bean id="boardDao" class="exam.bean.BoardDao"></bean>
    ```
    
- 빈 객체 설정
    - singleton : 컨테이너당 한 개씩만 생성한다(기본값)
    - prototype : 빈을 요청 할 때마다 객체를 생성한다.
    - request : HTTP요청마다 빈 객체를 생성한다.
    - session : HTTP session마다 빈 객체를 생성한다.
    - global-session : portlet지원하는 컨텍스트에서 사용한다.
- 객체 설정하는 방법
    1. xml : Bean 등록
    2. Annotation 사용
- 어노테이션 사용
    - @Component, Controller, Service, Repository
        - 이걸 사용하면 자동적으로 앞글자가 소문자인 객체가 생성된다.
        - 그래서 BoardService boardService라고 했구나…
    - @Autowired → 생성자, 필드, 메소드에 가능함.
    
    ```java
     	@Autowired
    	IMyDAO dao;
    
    	@Autowired
    	public void setDao(IMyDAO dao) {
    		this.dao = dao;
    	}
    	
    	@Autowired
    	public MyServiceImpl(IMyDAO dao) {
    		this.dao = dao;
    	}
    ```
    
- DAO에 여러가지 DB가 상속되는 경우에는 @Repository(”이름”)과 같이 명확하게 하고, Service에서 사용할 때 @Qualifier(”이름”)을 사용하면 예외를 막을 수 있다.
