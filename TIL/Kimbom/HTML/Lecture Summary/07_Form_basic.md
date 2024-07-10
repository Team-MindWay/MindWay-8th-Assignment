Form 기본
====
- 로그인 or 회원가입 or 어떤 물건을 사거나 또는 글을 살때 입력한 정보를 서비스를 제공하는 서버 -> 그쪽으로 정보 전송 -> 그때 사용 글자를 입력하는 것들, 무언가 선택하는 것들 -> form 
- 사용자가 입력한 정보를 서버로 전송할 때 사용하는 그러한 서버들을 form 이라고 함

**어떤 서버로 데이터를 전송할 때 html 코드 규칙**
```
<html>
<body>
<form action="http://localhost/login.php">
    <p>아이디: <input type="text" name ="id"></p>
    <p>비밀번호: <input type="password" name ="pwd"></p>
    <p>주소: <input type="text" name ="address"></p>

    <input type="submit">
</form>
</body>
</html>
```

input 태그
----

- 사용자로부터 정보를 입력받을 수 있는 태그
- 즉, 사용자로부터 어떤 정보를 입력한다는 뜻
- type 이라는 속성으로 text 를 하게 되면 -> 사용자로부터 문자 정보를 받을 수 있는 **input 할 수 있는 박스가 생김**
- type 으로 password 라고 지정을 해주면, password 에 해당되는 입력 박스가 생김 -> ** 이 쳐져서 몇 글자를 입력했는지는 알 수 있지만 어떤 글자를 입력했는지는 감춰서 뒤에 서 있는 사람이 볼 수 X

submit 버튼
-----
- 비밀번호, 아이디 입력 후 어떤 버튼 눌르면 우리가 입력한 정보가 서비스로 넘어감 -> 그 서비스가 가지고 있는 서버라는 곳으로 이동 됨 -> 이때 사용되는 버튼이 submit(제출하다)

**아직 정보 불충분**
- 우리가 입력한 정보가 어디에 있는 서버로 어디로 전송될 것인지에 대한 정보가 부족함 -> 이때 사용하는 태그가 **form** 태그!!!!!

Form 태그
====

action 속성
----
- 사용자가 입력한 정보들이 submit 버튼을 눌렀을 때 어디로 보낼 것인가 라고 하는 form 태그의 action 속성에 써주면 됨
```
<form action="http://localhost/login.php">
```
- 입력한 서버 로 url 이 바뀜

각각의 control 에 이름 정해주기
---

```
<p>아이디: <input type="text" name ="id"></p>
<p>비밀번호: <input type="password" name ="pwd"></p>
<p>주소: <input type="text" name ="address"></p>
```
- 각각의 control에 아이디는 id 비밀번호는 pwd 주소는 address 이런 식으로 이름을 줬기때문에 서버쪽으로 전송할 때 바로 이 각각의 이름의 값으로 데이터가 전송됨 