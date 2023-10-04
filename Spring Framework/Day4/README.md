# 2023.09.21

### DB 연동 프레임워크

- Spring JDBC : JDBC Template, SQL은 Java 코드 안에 담음
- MyBatis : SQL Session, SQL은 xml로 구성함

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/b0a1d28b-50a4-4a9d-ba96-d20edbb2d16b/Untitled.png)

### 주의사항

- Mapper의 메소드 이름과 SQL을 정의하는 xml의 id가 같아야 실행된다.
- Mapper의 메소드 파라미터는 하나의 값(객체도 가능)이어야 한다.
- 파라미터나 결과를 전달할 객체(Entity Object)는 테이블의 컬럼과 이름이 같아야 한다.
- EO객체는 등록이 되어있어야 한다.

```jsx
<select id="login" parameterType="map" resultType="boolean">
		select count(*) from customer where username=#{userName
```

myBatis 사용할 때 return 타입이 Boolean인 경우, select username을 하면 String 값이 리턴되므로 리턴 타입이 맞지 않아 오류가 발생한다. 따라서 count로 변경해주어야 한다.

```jsx
<select id="search" resultType="customer">
		select * from customer order by cnum
	</select>
```

리턴 타입이 List<Customer>이어도 resultType은 Customer로 생각하고 적는다.

```jsx
<select id="searchCnum" parameterType="int"
		resultType="customer">
		select * from customer where cnum=#{value}
</select>
```

파라미터가 하나만 넘어올 경우에는 value로 작성해도 알아서 찾아준다.

### Elements

- resultMap – 데이터베이스 결과데이터를 객체에 로드하는 방법을 정의하는 요소, DTO와의 컬럼이 일치하지 않을 때 사용함.

```xml
<resultMap type="person" id="per">
<result property="pnum" column="num"/>
<result property="pname" column="name"/>
<result property="salary" column="salary"/>
</resultMap>
<select id=”selectPerson” parameterType=”int” resultMap=”per”>
SELECT * FROM PERSON WHERE ID = #{id}
</select>
```

- sql – 다른 구문에서 재사용하기 위한 SQL 조각

```xml
<sql id=”userColumns”> id,username,password </sql>

<select id=”selectUsers” parameterType=”int” resultType=”hashmap”>
	select <include refid=”userColumns”/>
	from some_table
	where id = #{id}
</select>
```

- insert – 매핑된 INSERT 구문
- update – 매핑된 UPDATE 구문
- delete – 매핑된 DELEETE 구문
- select – 매핑된 SELECT 구문
- cache – 해당 명명공간을 위한 캐시 설정
- cache-ref – 다른 명명공간의 캐시 설정에 대한 참조

### 동적 SQL

```xml
<select id=”findActiveBlogWithTitleLike” parameterType=”Blog” resultType=”Blog”>
	SELECT * FROM BLOG
	WHERE state = ‘ACTIVE’
	<if test=”title != null”>
		AND title like #{title}
	</if>
</select>
```

- 다음과 같이 if를 사용해서 SQL문을 동적으로 관리할 수도 있다.
- 다른 키워드로는 choose, when, other 등이 사용 가능하다.

```xml
<select id=”findActiveBlogLike” parameterType=”Blog” resultType=”Blog”>
	SELECT * FROM BLOG WHERE state = ‘ACTIVE’
	<choose>
			<when test=”title != null”>
				AND title like #{title}
			</when>
			<when test=”author != null and author.name != null”>
				AND author_name like #{author.name}
			</when>
			<otherwise>
				AND featured = 1
			</otherwise>
	</choose>
</select>
```

### Log4j 디버깅

```xml
<appender name="console" class="org.apache.log4j.ConsoleAppender">
<param name="Target" value="System.out" />
<layout class="org.apache.log4j.PatternLayout">
<param name="ConversionPattern" value="%-5p: %c - %m%n" />
</layout>
</appender>
<!-- Application Loggers -->
<logger name="SQL_XML NameSpace">
<level value="debug"/>
<appender-ref ref="console"/>
</logger>
```

- Logger : 로깅 메세지를 Appender에 전달
- Appender : 전달된 로깅 메세지를 파일에다 기록할 것인지, 콘솔에 출력할 것인지, DB에 저장할 것인지 결정함
- Layout : 어떤 형식으로 출력할 것인지 결정.
