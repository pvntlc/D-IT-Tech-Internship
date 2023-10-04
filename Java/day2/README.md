# 2023.08.29

## 3. 연산자

```java
// 변수명, 메서드명 : 식별자(Identifier)
/*
 * 문법상 1. 첫글자를 숫자, 공백으로 쓰면 안된다. 2. 유니코드 문자 가능하고, _ $ 가능함. 3. 식별자 이름은 의미있게 부여하세요.
 * 관습상 1. 클래스 이름 첫 글자는 대문자. 2. 변수, 메서드 이름 첫 글자는 소문자. 3. 두 번째 단어 첫 글자는 대문자. 4.
 * 상수는 모두 대문자로 작성 + 단어는 언더바 분류.
 * 
 * 메소드 바깥에는 선언문만 올 수 있다.
 */

class Abc {
  static int PI = 3.141592;
	public void m() {

	}

	public static void m() {

	}
}

// 이라는 메소드가 있을 때, 실제로 사용하기 위해서는
Abc a = new Abc();
a.m();

// static이 붙은 애들은 바로 호출 가능.
Abc.sm();
```

- &이면 앞과 뒤 모두 실행하고, &&이면 앞만 틀려도 실행 안 함.
- **int** a = ++x; // 연산장치로 직접적으로 가지 않기 때문에 이게 더 빠르다.

## 6. 클래스

![Image Pasted at 2023-8-29 12-33.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/74f54f8c-f8c4-4194-9bf2-1d92bb73a375/Image_Pasted_at_2023-8-29_12-33.png)

```java
public class MyDate {
	//Member Variable
	int year;
	int month;
	int day;
	
	public void info() {
		//Local Variable
		int year; // 초기화가 안되서 오류남.
		int year = 2000;
		System.out.println(year + "년 " + month + "월 "+ day+"일" );
	}
}
```

- Member Variable : 자동으로 초기화됨.
- Local Variable : 자동으로 초기화 안 됨, 값을 할당해야 한다.

```java
package com.bnk.chap6;

public class DateTest {
	public static void main(String[] args) {
		MyDate today = new MyDate();
		today.year = 2023;
		today.info();

		
		MyDate m1 = new MyDate();
		m1.year = 2023;
		m1.month = 9;
		m1.day = 28;
		
		MyDate m2 = new MyDate();
		m2.year = 2023;
		m2.month = 9;
		m2.day = 29;
		
		MyDate m3 = new MyDate();
		m3.year = 2023;
		m3.month = 10;
		m3.day = 2;
		
		m1.info();
		m2.info();
		m3.info();
		
	}
}
```

- 다음과 같이 작성하기 힘들어서 생성자를 사용한다.

```java
//생성자 : Consturctor
public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
```

```java
package com.bnk.chap6;

public class DateTest {
	public static void main(String[] args) {
		MyDate today = new MyDate(2023,8,29);
		today.info();
	}
}
```

- 생성자를 사용하면 다음과 같이 줄일 수 있다.

```java
public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public MyDate(int m, int d) {
		year = 2023;
		month = m;
		day = d;
	}
```

- 생성자의 오버로딩 : 이름은 같게 하고, 파라미터는 다르게 정의한 상황.
- this : 멤버변수 의미, 멤버변수와 지역변수 이름이 같다면 더 가까운 지역변수로 취급됨.

```java
public MyDate(int m, int d) {
		this(2023,m,d); // MyDate(int y, int m, int d)로 보냄.
	}
```

- 이런 식으로 사용 가능함.
- 번역될 때는 클래스 앞에 패키지 명 붙음(풀네임).

---

### 객체 생성 및 메모리에 올라가는 과정

```java
MyDate m3 = new MyDate();
// 1              2
// 2->1 = 3
```

1. m3라는 변수 stack 중 main 수행 공간에 저장함.
2. Memory Loading(클래스에 올려주는 장치를 ClassLoader라함)
    1. ClassLoader 내부에 있는 캐시 장치에 의해 이미 실려있다면, 다시 생성하지 않음.
    2. Class c =Class.*forName*("MyDate"); → 메모리 로딩을 한다.
3. 객체 생성
    1. 주소가 다른 상태로 :MyDate 객체가 계속 생김.
4. 생성자 호출
    1. stack 부분에 MyDate라는 생성자 생기고, 작업 수행하고 사라짐.
    2. 주소를 저장함.
    3. year, month 등에 값 할당함.
- Heap은 초기화 가능, Stack은 초기화 안됨.
- Heap은 메소드 실행 공간.

| Heap(Class) | Heap(class 제외공간) | Stack(Main 수행 공간 일부) |
| --- | --- | --- |
| 2)  :Class MyDate의 정보가 올라감. | 3)  :MyDate
year = 0,month = 0,day = 0 | 1) m3라는 변수 생김.                    4) m3에 주소가 올라감. |

![Image Pasted at 2023-8-29 15-25.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fb339621-63d1-46ca-a656-f603752ad80f/Image_Pasted_at_2023-8-29_15-25.png)

+++ print()는 객체 출력시 자동적으로 toString()을 호출한다.

### 오버로딩

- 메소드 오버로딩 : 메소드 이름은 같지만, 받아들이는 파라미터가 다른 것.
- **static 메서드 안에서는 this를 쓸 수 없다. this는 new를 통해 만들어져야 가능한데, static은 new를 사용하지 않고 바로 사용가능하기 때문.**
- Abstract 또한 new를 사용해서 만들 수 없다
