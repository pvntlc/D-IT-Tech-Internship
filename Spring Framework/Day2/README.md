# 2023.09.19

### Framework

1. SW의 구조를 구현한다.
2. 구체적인 기능 빼고 다 구현되어 있는 반제품이다.
3. 이미 경험된 사례들을 바탕으로 좋은 점을 모아둔 Pattern의 집합이다.
    1. **Architecture Pattern** : 전체 구조에 대한 패턴
        1. MVC, MVP, PAC, Layer
        2. Client(클라이언트), Presentation Tier(컨트롤러, 뷰), Business(서비스), Integration(DAO), Resource(DB)
        3. 선배들이 헷갈릴 만한 용어 : 플랫폼, 옛날에는 OS에서 직접적으로 작업했는데 지금은 OS 위의 다른 공간에서 작업하므로 플랫폼의 의미가 다를 수 있다.
    2. **Design Pattern** : 디자인 패턴, 클래스간의 관계성 구조 등.
        1. GoF
        2. Java EE
        3. POSA
    3. **Coding Pattern**  : 코딩 패턴, 클래스 내부에서 코딩을 어떻게 할 것인가.
        1. 반복문 안에서는 메소드를 호출하지 마세요.
        2. 멤버변수 보다는 지역변수.
        3. 상수 계산은 풀어서 써줘야 한다. 런타임 보다 컴파일 타임에 계산되기 때문.

### Spring AOP?

- 실제 업무 로직들과 관련이 없는 것들을 빼내서 실행하는 것.
- 원래 서비스와 로직들에게 전혀 영향이 가지 않음.
- @Aspect 어노테이션을 달면 됨.
- 실제 배포시에는 빼내서 버릴 수 있으며 원래 코드에 영향이 가지 않는다.
- https://engkimbs.tistory.com/746

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/3bdec710-87ea-4c81-a1ed-faa276a3e35c/Untitled.png)

1. 요청이 들어온다.
2. 요청에 대한 정보들을 Handler Mapping에게 물어본다.
3. 받아온 Controller의 정보를 통해 해당 Controller에게 전달한다.
4. Controller가  요청을 처리하고 Model에 저장하여 ModelAndView를 반환한다.
5. 반환된 View를 ViewResolver에게 보내 실제 경로를 알아낸다.
6. 알아낸 실제 경로를 통해 View를 반환한다.

### Spring MVC

- web.xml : 웹 컨테이너 환경 설정 파일, 서버 로딩 시 root-context.xml을 읽어서 처리한다.
- root-context.xml : @Service, @Repository 관련 클래스에 필요한 환경 설정을 한다. 예를 들어, ConnectingPool이나 DB Framework 등을 설정한다.
- Model.addAttribute, Session.setAttribute, ModelAndView.addObject임
