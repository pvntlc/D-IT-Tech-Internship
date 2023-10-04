# 2023.09.15

### DOM

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/af24a09c-661e-49f0-8040-f1d0a9110aec/de922515-891f-4188-ac66-5fd677b478cb/Untitled.png)

- QuerySelector()메서드는 한 개만
- QuerySelectorAll()은 반환 값이 여러 개면 모두 반환. 노드리스트로 저장.

### Javascript 이벤트 등록

1. <tag onxx = “함수명();”/>
2. <script> id명.onxxx = 함수명; id명.onxxx = function(){};
3. 객체.addEventListener(”이벤트”, 함수);
4. $(”선택자”).event(함수);
