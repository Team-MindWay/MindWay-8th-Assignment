Form : radio.checkbox
====
- 사용자들로 하여금 여러 개의 선택지 중의 하나 또는 복수 개를 선택해서 제출할 수 있도록 하는 라디오 버튼과 체크박스 

**form_choice2.html**
```
<html>
    <head>
    <meta charset="utf-8">
    </head>
    <body>
    <form action="http://localhost/order.php">
     <p>
     <h1>색상(단일선택)</h1>
    붉은색: <input type="radio" name="color" value="red">
    검은색: <input type="radio" name="color" value="black" checked>
    파란색: <input type="radio" name="color" value="blue">
     </p>
     <p>
     <h1>사이즈(다중선택)</h1>
    95: <input type="checkbox" name="size" value="95">
    100: <input type="checkbox" name="size" value="100" checked>
    105: <input type="checkbox" name="size" value="105" checked>
     </p>
     <input type="submit">
     </form>

    </body>
</html>
```

라디오 버튼(ratio)
---
- 중복 가능
```
 <input type="radio">
```
- 라이오 버튼은 어떤것인지: 하나의 버튼만 누를 수 있도록 되어있었음 -> 은유를 한 버튼
```
<p>
    <input type="radio" name="color">
    <input type="radio" name="color">
    <input type="radio" name="color">
     </p>
     <p>
    <input type="radio" name="color2">
    <input type="radio" name="color2">
    <input type="radio" name="color2">
     </p>
```
- 네임(name)값이 값은 것들끼리 그룹핑(grouping) 이 되는것이고 같은 그룹에 속하는 것 중에서 하나가 선택되면 나머지의 선택이 해제되는 형태의 버튼이다.

**value**
- 우리가 선택한 선택지가 어떤 값이 돼야 되는지는 value 로 적어주면 됨
```
붉은색: <input type="radio" name="color" value="red">
```

체크 박스(check box)
---
```
<p>
     <h1>사이즈(다중선택)</h1>
    95: <input type="checkbox" name="size">
    100: <input type="checkbox" name="size">
    105: <input type="checkbox" name="size">
</p>
```
- 같은 그룹에 있는 것이 여러 개가 선택되게 하는 컨트롤 -> 체크 박스
- 라디오(ratio) 버튼과는 다르게 같은 네임(name)을 가지고 있는 여러 개의 컨트롤들을 다중으로 선택할 수 있다는 특징을 가지고 있음

체크트checked 속성
---
- **사용자가 웹페이지를 열었을 때 기본적으로 어떠한 항목이 선택되고 싶다** -> ratio 든 checkbox 건 마찬가지로 기본적으로 선택됐으면 하는 항목에다가 아래처럼 체크트(checked) 라고 하는 속성을 값 없는 속성을 넣어주면 됨