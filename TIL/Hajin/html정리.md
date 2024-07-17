# HTML이란?

> **H**yper**T**ext **M**arkup **L**anguage의 약자이다.

## 기본 문법

```
<시작 태그>문장</닫히는 태그>
```

- `<strong>` : 어떤 문자를 강조하고 싶을 때 사용한다.
- `<h1>` : 어떤 문자를 제목으로 표시하고 싶을 때 사용한다. ‘heading 1’의 약자이고 숫자를 크게 할수록 글씨가 점점 더 작아진다. `<h1>`~`<h6>`까지 있다.
- `<a>` : ‘anchar’의 약자이다. `<a>`태그 안쪽에 있는 부분이 **링크**라는 사실을 브라우저에게 알려준다. 하지만 `<a>`태그만으로는 그 문장이 어떤 웹 페이지에 연결되었는지는 알려줄 수 없다.
  → 태그명만으로는 정보가 불충분하다.
  → 속성을 사용한다.
  `html
<a href ="(주소)">(문장)</a>
`
- `<li>` : 각각의 항목들을 리스트로 표현하기 위해 사용한다. 단독으로 사용하지 않는다. ‘list’의 약자
- `<ul>` : 각각의 서로 성격이 같은 항목들을 하나의 태그로 묶어줄 때 사용한다. 그룹핑을 해준 효과가 있다. ‘unordered list’의 약자, ‘순서가 없다’ 라는 뜻이다.
- `<ol>` : ‘ordered list’의 약자, ‘순서가 있는 리스트’ 라는 뜻이다.
- `<title>` : 웹페이지의 제목을 표시할 때 사용한다.
- `<meta charset=”utf-8”>` : 웹 페이지의 글씨가 깨지는 것을 방지하기 위해 사용한다. 닫히는 태그가 필요하지 않다.
- `<head>` : 본문이 아닌 태그들이 들어온다. `<title>`, `<meta>` 태그는 `<head>` 태그 밑에 넣도록 약속되어 있다. 고위직 태그라고 할 수 있다.
- `<body>` : 본문인 태그가 들어온다. `<h1>`, `<ol>` 태그 이런 것들은 `<body>`태그 밑에 넣도록 약속되어 있다. 고위직 태그라고 할 수 있다.
- `<html>` : `<head>`태그와 `<body>`태그는 `<html>`이라는 태그로 감싸주도록 약속되어 있다.
- `<img>` : 이미지를 표시할 때 사용한다. 태그를 닫을 필요가 없다. src라는 속성을 사용한다. 만약 이미지의 크기를 변경하고 싶다면 width를 높이를 지정하고 싶다면 height를 사용하면 된다. 또한 이미지를 웹페이지에 포함할 때 alt 라고 하는 속성을 써주는 것이 좋다. tooltip 이라는 것을 통해서 도움말이 나오게 하고 싶다면 title의 속성을 통해서 만들 수 있다.

```html
<img
  src="(이미지 파일)"
  width="100"
  height="300"
  alt="이미지 설명"
  title="이미지 설명"
/>
```

- `<br>` : 줄바꿈할 때 사용한다. ‘A forced line-break’의 약자이다. 줄바꿈을 여러 개 할 수 있다. 자유롭게 간격을 조정할 수 있다. ‘void element’라고 해서 내용이 없는 태그라는 뜻이다. 줄바꿈 태그이기 때문에 내용이 없다.
- `<table>` : 표에 해당되는 태그이다. 테이블을 만들 때 전체는 table이라는 태그로 묶어줘야 한다.테두리를 지정하는 방법은 border 라는 속성을 사용하면 된다. 행을 병합할 때는 rowspan 속성을 사용하고 열을 병합할 때는 colspan이라는 속성을 사용하면 된다.
- `<thead>`, `<tbody>`, `<tfoot>` : table에 있는 데이터들의 어떤 위치 같은 것들을 결정하는 역할을 한다는 것을 볼 수 있다.

```html
<table border="1">
  <thead>
    <tr>
      <th>이름</th>
      <th>성별</th>
      <th>주소</th>
      <th>회비</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>정하진</td>
      <td>여</td>
      <td rowspan="2">광주</td>
      <td>1000</td>
    </tr>
    <tr>
      <td>배경진</td>
      <td>여</td>
      <td>500</td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td colspan="3">합계</td>
      <td>1500</td>
    </tr>
  </tfoot>
</table>
```

- `<td>` : 하나의 열을 묶을 때 사용한다. ‘table data’의 약자이다.
- `<tr>` : 하나의 행을 묶을 때 사용한다. ‘table row’의 약자이다.
- `<p>` : 단락을 구분할 때 사용하는 태그이다. ‘paragraph’의 약자이다. 줄바꿈의 간격이 고정되어 있다. `<p>`태그에 되어있는 디자인을 ‘css’라는 프로그래밍 언어를 통해서 변경할 수 있다.
- `<script>` : 자바스크립트 같은 걸 쓸 때 사용한다.
- `<div>` : 웹페이지를 꾸며줄 때 그룹핑 해주는 태그이다.

### 속성

- 속성의 이름에 따라서 기능이 정해져 있다.
- 속성의 순서는 상관이 없다.
- 태그 뒤에 붙어서 사용된다.
  ex) href, target, title 등

```html
<a target="_blank" href="(주소)">(문장)</a>
```

### DOCTYPE

- ‘document type declaration’의 약자이다.
- 자신이 작성한 html 코드가 어떤 방식에 html 코드로 작성 됐는지를 선언하는 브라우저에게 알려주는 그런 문자라고 볼 수 있다.
- ‘이것은 어떠한 표준을 따르고 있는 태그들이야’ 라는 것을 브라우저에게 알려주는 것이다.
- 어떠한 형식에 어떠한 표준을 따라서 문서를 작성했는지에 따라서 적당한 DOCTYPE을 선언해줄 필요가 있다.

### form

사용자가 입력한 정보를 서버로 전송할 때 사용하는 기능이다.

### `<input>`

: 사용자가 입력한 정보를 서버에 전송하기 위해서는 사용자로부터 정보를 입력 받을 때 사용하는 태그이다.

- type이라는 속성으로 “text”를 하게 되면 사용자로부터 문자 정보를 받을 수 있는 박스가 생긴다.
- type으로 “password”라고 지정을 하면 password에 해당되는 입력 박스가 생긴다. 즉, 입력하는 정보는 \*\*\*이 쳐져서 몇 글자를 입력했는지는 알 수 있지만 어떤 글자를 입력했는지는 알 수 없다.
- 각각의 control 에다가 이름을 정해줄 때 name을 사용한다.
- submint 버튼을 눌렀을 때 어디로 보낼 것인가 라고 하는 정보는 <form> 태그 action이라는 속성에 써주면 된다.
- 주소를 정확히 action의 속성 값으로 넣어주기만 하면 된다.

```html
<html>
  <body>
    <form action="(url)">
      <p>아이디 : <input type="text" name="id" /></p>
      <p>비밀번호 : <input type="password" name="pwd" /></p>
      <p>주소 : <input type="text" name="address" /></p>
      <input type="submit" />
    </form>
  </body>
</html>
```

- name 이라는 속성은 모든 `<form>` 태그에서 다 필요한 것들이다.
- 사용자가 어떤 웹페이지를 열었을 때 기본적으로 입력창에 무언가 문자가 써 있었으면 좋겠다면 value 라고 하는 속성을 사용하면 된다.

### `<textarea>`

:여러 줄을 입력 받을 때 사용한다.

- cols라는 속성을 사용하면 입력한 값에 따라 글자 수를 입력할 수 있게 된다.
- rows라는 속성을 사용하면 속성 값에 따라 줄을 입력할 수 있게 폭이 커진다.
- textarea도 나머지 텍스트 필드들과 마찬가지로 기본값을 줄 수 있는데 그땐 value 라는 속성을 사용하지 않고 `<textarea>` 태그 안쪽에다가 기본값을 주면 된다.

```html
<html>
  <body>
    <form>
      <p>text : <input type="text" name="id" value="default value" /></p>
      <p>
        password : <input type="password" name="id" value="default value" />
      </p>
      <p>
        textarea :
        <textarea cols="50" rows="2">default value</textarea>
      </p>
    </form>
  </body>
</html>
```

### Dropdown List

: 제한된 공간 안에서 여러 개의 선택지를 선택할 수 있도록 하는 기능이다.

- `<option>` : 아무런 선택 기능이 없을 때 사용한다. value 라는 속성은 컴퓨터가 좋아하는 정보를 전송할 때 사용한다.
- `<select>` : `<option>`태그를 묶을 때 사용한다. select 가 어떤 이름으로 정보를 전송할 때 name이라는 속성을 사용한다. combo box를 사용자가 여러 개의 항목을 선택하게 하고 싶을 때 multiple이라는 속성을 사용한다.
- mulriple 이라는 속성은 속성 값이 없어서 사용할 때 속성 이름만 적으면 된다.

### radio, checkbox

**radio**

: 여러 개의 선택지 중의 하나 또는 복수 개를 선택해서 제출할 수 있도록 한다.

- `<input type="radio">`라고 하면 동그란 원이 생겨서 라디오 버튼을 만들 수 있다.
- 둘 중 하나가 선택되면 하나가 없어지게 하려면 두 개를 같은 이름으로 묶어주면 된다. → 같은 이름으로 지정되어 있는 것들끼리는 하나의 버튼만 선택된다.
- name 값이 같은 것들끼리 그룹핑이 된다.
- 라디오 버튼은 같은 그룹에 속하는 것 중에서 하나가 선택되면 나머지의 선택이 해제되는 형태의 버튼이다.
- 각각의 선택지가 어떤 값이 되어야 하는지는 value로 적어주면 된다.

```html
<p>
	<h1>색상</h1>
	붉은색 : <input type="radio" name="color" value="red">
	검은색 : <input type="radio" name="color" value="black">
	파란색 : <input type="radio" name="color" value="blue">
</p>
<p>
	<input type="radio" name="color2">
	<input type="radio" name="color2">
	<input type="radio" name="color2">
</p>
```

**checkbox**

: 같은 그룹에 있는 것이 여러 개가 선택되게 하는 컨트롤이다.

- 같은 name을 가지고 있는 여러 개의 컨트롤들을 다중으로 선택할 수 있다.
- checkbox는 radio와 달리 name 대신 size를 쓴다.
- 기본적으로 선택됐으면 하는 항목에다가 checked 라는 값이 없는 속성을 넣어주면 된다.

```html
<p>
	<h1>색상(단일선택)</h1>
	붉은색 : <input type="radio" name="color" value="red">
	검은색 : <input type="radio" name="color" value="black" checked>
	파란색 : <input type="radio" name="color" value="blue">
</p>
<p>
	<h1>사이즈(다중선택)</h1>
	95 : <input type="checkbox" size="color" value="95">
	100 : <input type="checkbox" size="color" value="100" checked>
	105 : <input type="checkbox" size="color" value="105" checked>
</p>
```

### button

- `<input type="submit">` : 우리가 원하는 곳으로 어떤 정보를 제출할 때 사용한다. 제출에 적혀있는 내용을 바꾸고 싶다면 value 값을 정해주면 된다.
- `<input type="button">` : 기본적으로 이름이 없기 때문에 value 값으로 이름을 직접 지정해야 한다. 그냥 버튼의 UI만 만들어진다. 자바스크립트라는 프로그래밍 언어가 사용될 때 활용도가 생긴다.
- `<input type="reset">` : “reset”이 속해 있는 `<form>`태그 아래에 있는 모든 사용자가 입력한 정보가 초기화 된다.

### hidden field

: 눈에 보이지 않지만 서버쪽으로 어떤 데이터를 전송할 때 사용하는 것이다.

- UI가 없지만 서버로 어떤 값을 전송하고 싶을 때는 hidden이라고 하는 type의 `<input>` 태그를 쓰면 된다.
- `<input type="hidden" name="hide" value="egoing">` : type이 hidden이기 때문에 ‘submit’ 버튼을 눌렀을 때 URL로 hide 라고 하는 값을 ‘egoing’이라고 하는 값이 전송이 되게 된다는 것이다.

```html
<html>
  <head>
    <meta charset="utf-8" />
  </head>
  <body>
    <form action="(url)">
      <input type="text" name="id" />
      <input type="”hidden”" name="”hide”" value="”egoing”" />
      <input type="submit" />
    </form>
  </body>
</html>
```

### label

: 어떤 텍스트는 무언가의 이름표라는 것을 이 태그를 통해서 좀 더 정확하기 기술해 줄 수 있다. 될 수 있으면 쓰는 것이 웹 페이지를 좀 더 정보로서의 가치를 줄 수 있다. 사용성을 좀 더 높이는 효과도 있다.

- 각각의 레이블들이 누구의 이름표인지를 연결시켜줄 때 for라는 속성을 사용한다.
- id 라고 하는 속성을 주면 누구의 레이블인 지를 나타낼 수 있다.

```html
<html>
  <body>
    <form>
      <p>
        <label for="id_txt">text</label> :
        <input id="id_txt" type="text" name="id" value="default value" />
      </p>
      <p>
        <label for="password">password</label> :
        <input id="password" type="password" name="id" value="default value" />
      </p>
      <p>
        <label for="comment">textarea</label> :
        <textarea id="comment" rows="2">default value</textarea>
      </p>
      <label for="color_blue">
        <input id="color_blue" type="checkbox" name="color" value="blue" />
        파란색
      </label>
    </form>
  </body>
</html>
```

- id값을 입력하는 게 귀찮을 때는 아래처럼 label이라는 태그를 감싸주면 된다.

```html
<html>
  <body>
    <form>
      <p>
        <label for="id_txt">text : </label>
        <input id="id_txt" type="text" name="id" value="default value" />
      </p>
      <p>
        <label for="password">password : </label>
        <input id="password" type="password" name="id" value="default value" />
      </p>
      <p>
        <label
          >textarea :
          <textarea rows="2">default value</textarea>
        </label>
      </p>
      <p>
        <label>
          <input type="checkbox" name="color" value="red" /> 붉은색
        </label>
      </p>
    </form>
  </body>
</html>
```

### method

**post** 방식 : url이 아니라 다른 방법으로 데이터를 숨겨서 전송하는 방식이다. form을 이용해서 데이터를 전송한다면 100% 이 방식을 이용해서 전송하면 된다.

**get** 방식 : url을 통해서 데이터를 전송하는 방식이다.

```html
<html>
  <head>
    <meta charset="utf-8" />
  </head>
  <body>
    <form action="(url)" method="post">
      <input type="text" name="id" />
      <input type="password" name="pwd" />
      <input type="submit" />
    </form>
  </body>
</html>
```

### UPLOAD

- ‘파일을 선택하는 ui를 만드는 것은 바로 `<input>` 태그다’ 라는 사실만 알면 된다.
- 파일을 서버로 전송하기 위해서 또 어디로 전송할 것인지를 지정하기 위해서 form 이 필요하다.
- 사용자가 선택한 파일을 어디로 전송할 것인지를 action에다가 저장하면 된다.
- 사용자가 파일을 선택해서 제출 버튼을 누르면 사용자가 선택한 파일은 url로 전송이 된다.
- url이 전송이 되면 프로그램이 그 파일을 받아서 컴퓨터에 저장하게 된다.
- 파일을 전송 하기 위해서는 method와 enctype 이라는 속성을 추가해야 한다.
- 파일의 `<input>` 태그도 이름이 있어야 된다.

```html
<html>
  <head>
    <meta charset="utf-8" />
  </head>
  <body>
    <form action="(url)" method="post" enctype="multipart/form-data">
      <input type="file" name="profile" />
      <input type="submit" />
    </form>
  </body>
</html>
```

### 정보로서 HTML

HTML이 처음에 고안되었을 때에는 단지 웹페이지를 표현하기 위한 언어였다.

웹이 폭발적으로 성장하면서 인류의 많은 정보들이 ‘웹 화’ 된다.

→ HTML이라는 언어를 통해서 표현되기 시작한다.

HTML 이라는 것은 굉장히 중요한 사회적 역할을 담당한다.

→ 인류의 지식을 담아내는 그릇 같은 역할

이런 역할을 더 잘 수행하기 위해서 무엇을 해야 될까? 라는 고민들의 과정에서 HTML이라고 하는 것이 정보를 표현하고 정보를 담아내는 역할에 집중하고 전념할 수 있게 하기 위한 여러가지 조치들이 취해진다.

### `<font>`

- 대표적으로 퇴출된 태그 중에 하나다.
- 폰트의 크기는 1~7의 숫자 사이에 있다.
- 어떤 문자만 색깔을 주고 싶으면 color 라는 속성을 사용하면 된다.
- 아무런 의미 가지고 있지 않다.
- 시각적인 정보, 디자인일 뿐이다.

```html
<html>
  <head>
    <meta charset="utf-8" />
  </head>
  <body>
    <font size="1">Hello</font>world
  </body>
</html>
```

### `<meta>`

: 어떤 데이터가 있으면 그 데이터를 설명하는 데이터를 meta data 라고 한다. 정보들을 통해서 검색이나 분류 등을 할 때 사용하는 태그이다. 웹페이지의 내용은 아니지만 그 내용을 또는 그 웹페이지를 설명하는 역할을 한다.

- charset 이라는 속성 값을 utf-8이라고 하면 웹 브라우저는 ‘UTF-8’ 로 해석해서 표현해주게 된다. → 생략한다면 웹 브라우저는 웹페이지가 어떤 방식으로 저장 되었는지 알 수 없다.

  ```html
  <meta charset="utf-8" />
  ```

- 정보들을 컴퓨터에 저장하는 것을 인코딩(Encoding)라고 한다.
- 저장되어 있는 정보를 꺼내서 화면에 표시하는 그 과정을 디코딩(Decoding) 이라고 한다.
- 검색 결과에 내용에 대한 요약 같은 게 나올 때 meta 태그의 name 속성 값이 요약 자료에 사용될 가능성이 상당히 높다.
- http-equiv 속성에 refresh 라고 하고 content를 30으로 하면 웹페이지는 30초 간격으로 refresh 가 된다. → 자주 사용하는 것은 아니다.

  ```html
  <meta http-equiv="refresh" content="30" />
  ```
