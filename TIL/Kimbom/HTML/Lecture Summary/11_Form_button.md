Form:button
====
```
 <form action="http://localhost/form.php"></form>
        <input type="submit">
```
- 제출 버튼이 생기면서 원하는 곳으로 어떤 정보를 제출할 수 있는 제출할 때 사용하는 버튼이 생성됨
**but 제출에 적혀있는 내용을 바꾸고 싶다?**

value 값 지정
---
```<input type="submit" value="전송">```
- '전송' 이라고 적어주면 전송이라는 내용을 가진 버튼이 생성됨

또 다른 버튼
===

button 버튼
---
1. ```<input type="button" value="버튼">```
- 이 경우는 기본적으로 이름을 직접 지정해줘야 함
- 이 버튼에서는 아무런 일도 일어나지 않음 (!= submit 버튼)
    - 버튼의 UI 만 만들어진 것 -> html 이라는 기술만 순수하게 사용하는 경우엔 쓸데가 X -> 자바 스크립트 코드 작성시 사용
     예)
    ```
    <input type="button" value="버튼" onclick='alert('hello world!')">
    <!--html의 onclick 속성--!>
    ```
    - javascript 라는 html 과 완전히 다른 프로그래밍 언어
**제출시, 경고창이 뜨면서 입력한 helloworld 가 뜬 것을 볼 수 있다.**
- 자바스크립트라는 프로그래밍 언어가 사용될 때 그때에 활용도가 생기는 버튼이 -> button

reset 버튼 : 재설정 버튼
---
2. ```<input type="reset">```
- ```<input type="text">``` 작성 후, 전송 버튼을 누르면 사용자가 입력한 정보가 서버로 전송 됐지만, 재설정이라는 것을 누르면 모든 정보 -> "reset" 이 속해 있는 이 form 태그 아래에 있는 **모든 사용자가 입력한 정보가 초기화 됨**
