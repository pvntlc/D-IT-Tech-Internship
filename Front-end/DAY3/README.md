# 2023.09.08

### 자바스크립트

- undefined : 자료형이 지정되지 않은 변수 선언만 하고 값만 할당하지 않은 변수.
- var price = “3000원”이라 했을 때 int형으로 바꾸면 3000으로 되지만, w3000원인 경우에는 바
꾸지 못한다.
- 3 == “3”은 true, 3===”3”은 false.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> 함수</title>

    <script>
      
      // 함수 선언문
      function myfun1(num) {
        var sum = 0;
        for (let i = 1; i <= num; i++) {
          sum += i;
        }
        console.log(sum); // 55
      }
      myfun1(10);

      // 함수 표현식
      var myfun2 = function (num) {
        var sum = 0;
        for (let i = 1; i <= num; i++) {
          sum += i;
        }
        console.log(sum); // 55
      };
      myfun2(10);

      //즉시 실행 함수
      (function(){
		  document.write("<h1>Hello~~</h1>");
	  }());
	  
	  myfun4 = function(){
		  document.write("<h1>Hello~~</h1>")
	  }
	  myfun4();
	  
	  // 람다함수
	  let myfun3=  () => document.write("<h1>람다 함수 호출</h1>");
	  
	  myfun3();
	  
	  
    </script>
</head>
<body>
    
</body>
</html>
```
