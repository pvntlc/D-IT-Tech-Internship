# 2023.09.20

### 오늘의 학습 목표 !!

1. 스프링 프레임워크를 이용하여 파일 업로드 하는 방법을 이해하고 활용한다.
2. 비동기 처리의 구조와 방법을 이해하고 활용한다.
3. 스프링 예외 처리를 이해하고 활용한다.

### 파일 업로드

- DB에 BLOB, CLOB 등 이미지 파일을 저장할 수는 있음.
- 하지만 DB에 이미지를 저장하면 DB의 속도가 느려지고 크기가 커지므로, DB에는 파일의 이름만 저장한다.

```xml
<dependency>
<groupId>commons-fileupload</groupId>
<artifactId>commons-fileupload</artifactId>
<version>1.4</version>
</dependency>
```

```xml
<!-- fileUpload -->
<beans:bean id="multipartResolver"
class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
	<beans:property name="defaultEncoding" value="UTF-8"/>
	<beans:property name="maxUploadSize" value="52428800"/>
	<beans:property name="maxInMemorySize" value="1048576"/>
</beans:bean>
```

### 동기 호출

- 요청을 보내고 응답이 올 때가지 기다리는 방식.
- 스레드가 하부 작업을 실행중일 때 스레드의 실행이 멈추게 되는 호출.
- 작업이 요청되는 순서대로 차근차근 빠르게 접근하지만, 많은 작업을 동시에 실행할 수 없다.

### 비동기 호출

- 작업중에 js가 서버에 가서 처리하고 데이터를 가지고 응답하는 것을 의미함.
- 스레드에서 하부 작업을 요청시 하부 작업의 완료, 리턴에 상관 없이 스레드 실행이 계속 실행되고 있는 호출이다.
- 상위 스레드가 하부 작업의 결과물이 언제 나올지 알 수 없으므로, 특정 시기에 하부 작업 결과 값을 호출하는 콜백 메커니즘이 사용된다.
- 자바스크립트에서 변수를 만들고, 함수를 통해 특정값을 정하고 나중에 불러오는 방식이다.

### Callback

- 비동기 호출로 실행되고 있는 스레드에서 리턴된 하부 작업의 결과물을 필요할 때 불러오는 메커니즘.
