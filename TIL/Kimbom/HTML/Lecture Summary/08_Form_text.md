Form: 문자입력
====
- 사용자로부터 텍스트를 입력받는 폰태그

form_text.html
```
<html>
<body>
    <form action="">
   <p>text: <input type="text" name="id" value="default value"></p>
   <p>password: <input type="password" name="pwd" value="default value"></p>
   <p>textarea: 
    <textarea cols="50"rows="2">default value<textarea>
   </p>
    </form>
<body>
</html>
```

value 속성
---
- 기본값을 정하고 싶을때
```
 <input type="text" name="id" value="default value">
```
- value가 적혀있는 값 : 사용자가 페이지를 열었을 때 기본적으로 적혀 있다. 

```<textarea> ~~ </textarea>```
- 여러 줄을 입력할 수 있는 화면이 뜸
```
 <textarea cols="50"rows="10"><textarea>
```
- 여러가지 속성들을 이용해서 어떤 정보들을 입력하는 것들을 변경할 수 있음 

```
 <textarea cols="50"rows="2">default value<textarea>
```
- value를 하는것이 아니라 textarea 에 컨텐츠로 태그 안쪽에다가 default value 라고 입력하면 기본값이 들어가게 됨
- textarea 가 ```<input type="text">``` 와 다른 형태의 태그를 가지고 있는 이유는 
```
<input type="text" name="id" value="default value">
```
이 부분 value의 속성값에 여러 줄을 입력하기가 애매함 -> 여러 줄을 입력받는 그런 컨트롤의 경우에는 별도의 textarea 라고 하는 태그가 있는 것 -> 그 태그의 기본값을 그 태그 안쪽에다가 컨텐츠에 입력하게 할 수 있도록 하기 위해서 다른 형식의 문법을 가지고 있는 것

text를 입력받는 주요한 방법 3가지
----
1) ```<input type="text">```
2) ```<input type="password"> ```
3) 여러줄을 입력받는 textarea 