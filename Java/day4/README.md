# 2023.08.31

### 클래스 작성할 때 고려할 사항

- Data
- 기능
- 상속
- 캡슐화
- 생성자
- toString()

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/150723ef-c3cc-4301-8a4b-ae190b0b31ee/Untitled.png)

`Parent p2 = c`를 하여 p2가 c를 가리키게 했을 때, 객체는 Parent이므로 k와 같은 변수를 요청한다면 5를 리턴한다. 그러나 메소드를 호출하면 객체는 parent이지만 child도 붙어있어 오버라이딩된 메소드가 호출된다. 따라서 p2.m()을 하게 되면 Child의 m메소드가 호출된다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e2af5e71-1be2-4fde-9551-24be8b7232be/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8115cdb3-f493-4107-b58a-03f1831188b1/Untitled.png)

### Compiler(컴파일러)

- 코드가 문법에 맞는지 확인하고, 0과 1로 번역한다 - 일반적인 컴파일러
- 사용중인 모든 클래스 이름을 풀네임(ex. com.bus.Parent)으로 바꾼다.
    - 패키지와 import는 번역되지 않는다.
- 상속을 받고 있지 않다면, extends Object를 추가한다.
- 생성자가 하나도 없다면, 기본 생성자를 삽입한다.
- 생성자 내부에 super(), this()가 첫 줄에 없다면, super()를 자동으로 삽입한다.
- java.lang 패키지의 class를 기본 import가 처리.
- autoBoxing 처리(`Integer age = new Integer(20); → Integer age = 20;`)
- code 최적화(상수 연산, 메소드 호출 등)
    - `Thread.sleep(24*60*60*1000);`

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0693fc6f-717e-4f16-a5eb-e6501b14ed04/Untitled.png)

### This vs Super

- This
    - 자신의 참조값.
    - this는 독립적으로 사용 가능.
    - this.변수
    - this.메소드() 가장 아래에 있는 자손클래스 메소드.
    - this()
- Super
    - this가 상속받은 객체의 참조값.
    - 독립적으로 사용 불가능.
    - super.변수
    - super.메소드()
    - super()

### Super를 만드는 방법

1. 완벽한 클래스(모두 구현된 메소드)
2. Abstract 클래스(일부 미구현된 메소드 포함)
3. interface(상수, 미구현된 메소드, 기본 메소드 구현 가능)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e75efdd-b889-4e3c-bc42-a5ba12537194/Untitled.png)

## Collections Framework

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f6a45e94-8934-4c51-90ec-43b3b447fc56/Untitled.png)

### 배열

- 하나의 이름으로 많은 데이터를 관리하는 데이터 구조.
1. 다만 크기가 고정
2. index 관리를 따로 해야 함
3. 삭제시 추가 작업이 필요함.
4. 검색속도가 느리다.

→ 이를 보완하기 위해 만들어진 것이 Collection API.

### List

- 순서가 있고, 중복 허용

### Set

- 중복을 허용하지 않고 순서가 없음.

### Map

- Key와 Value 한쌍으로 이루어짐.
- 중복을 허용하지 않고 순서가 없음.
- 검색속도 좋음.

### 패턴

- 소프트웨어의 특정 문제를 해결하는 방법을 기술해 놓은 것.
- Singleton Pattern
    - 오직 하나의 객체만을 생성해서 공유하고자 할 때 구현 방법.
    1. 생성자를 private 선언한다.
    2. 직접 자신을 생성한다.
    3. 외부에서 접근할 수 있는 public한 메소드를 만든다.
