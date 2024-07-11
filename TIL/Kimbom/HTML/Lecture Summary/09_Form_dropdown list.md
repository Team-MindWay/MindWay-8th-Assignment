Form: dropdown list
===
- 제한된 공간 안에서 여러개의 선택지를 선택할 수 있도록 하는 기능 

**form_chioce1.html**
```
<html>
    <head>
        <meta charset="utf-8"> // 이렇게 해야 한글이 안 깨짐
    </head>
    <body>
    <form action="http://localhost/color.php">
        <h1>색상</h1>
        <select name="color">
        <option value="red">붉은색</option>
        <option value="black">검은색</option>
        <option value="blue">파란색</option>
        </select>
        <h1>색상2(다중선택)</h1>
        <select name="color2" multiple>
        <option value="red">붉은색</option>
        <option value="black">검은색</option>
        <option value="blue">파란색</option>
        </select>
        <input type="submit"> 
    </form>
    </body>
</html>
```

option (선택지)
---
- 사용자가 어떤 색상을 선택할 때 정해져 있는 색상 중에 하나를 선택하게 할 때
- 즉 각각의 것들을 선택지로 정의한 것

**select name**
```
<select name="color">
```
select 를 어떤 이름으로 전송될 지 결정

**select value**
---
- 이렇게 하면 예를 들어 value 에 있는 black 이라고 하는 정보가 전송됨

**multiple 속성**
- 사용자가 여러 개를 여러 개의 항목을 선택하고 싶을 수도 있을때 사용
- multiple 이라고 하는 속성은 그 속성 값이 없기 때문에 그냥 multiple 이라는 속성 이름만 적어주면 됨
- 사용자가 복수개의 정보를 선택한 다음 제출버튼을 누르고 전송하면 서버 쪽에서 알아서 color=red&&color2=black&color2=blue 이런식으로 처리
