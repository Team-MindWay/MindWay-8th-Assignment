Form : method
===
- 사용자가 브라우저에 입력한 정보를, 서브밋(submit)버튼을 누르면 어떤 특정한 서버의 url로 전송하는 것 -> **폼(form)이 하는 기능**

데이터를 전송하는 방법
---
- 겟(get) 방식 : 우리가 여태까지 쓴 방식
- 포스터(post) 방식 : 보안

데이터를 전송할 때
---
```
localhost/method.php?id=engoing
```
- 웹 브라우저는 유알엘(url) 뒤에다가 물음표 아이디는 이고잉("?id=egoing") 이라고 해서 데이터를 전송
- 서버쪽에 있는 method.php라는 것이 열릴 때 아이디는 이고잉(id=egoing) 이라는 저 유알엘(url)의 값을 인지해서 어떠한 작업을 처리하게 되어있음

보안 문제
---
```
<input type="password" name="pwd">
```

URL)
```
localhost.method.php?id=engoing&pwd=11111
```
- 이렇게 적고 url 을 배포하면 자기 비밀번호가 노출되는 대형 사고가 발생

**정보는 경우에 따라 URL로 전달하는 것이 필요할 때가 있고, URL을 감춰서 전달할 필요가 있다.** -> 이때 사용하는 방식이 **포스트(post)** 방식

포스트(post) 방식
- 폼(form) 태그에서, 메소드(method)라고 하는 속성 지정
    - 데이터를 어떤 방법으로 전송할 것인가 ->**전송 방법의 타입 지정**

1. 겟(get) 방식
```
<form action="http://localhost.method.php" method="get">
```
URL ```localhost.method.php?id=engoing&pwd=11111```

2. 포스트(post) 방식
```
<form action="http://localhost.method.php" method="post">
```
URL ```localhost.method.php`` url 뒤에 아무런 정보도 붙지 X
 **우리가 메소드를 지정하지 않으면 기본적으로 겟(get) 방식으로 동작하기로 약속되어 있음**

1. **겟(get) 방식 :** 데이터를 전송할 때 url을 통해서 데이터를 전송하는 것은 
2. **포스트(post) 방식 :** url 이 아닌 다른 방법으로 데이터를 숨겨서 전송하게 됨 
    - 누가 url 을 공유한다고 해도 여기에는 우리가 전송한 id와 비밀번호에 대한 데이터가 없기 때문에 훨씬 더 안전함 

언제 겟(get) 방식을 쓰고 언제 포스트(post) 방식을 써야하는가?
---
- 폼을 이용하여 데이터를 전송한다 -> 100% 포스트(post) 방식을 이용해서 전송하면 됨