단락:p 태그
===
- p 태그는 'paragraph'(단락)의 줄임말 
- 단락 : 줄바꿈과 여백을 넣는 걸 통해서 단락을 구부하는게 일반적인 단락을 표현하는 방법이다. -> 이런 단락을 표현하는 태그가 p 태그
```
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
<p>HyperText Markup Language (HTML) is the standard markup language for documents designed to be
displayed in a web browser. It defines the content and structure of web content. It is often assisted by
technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript.</p>
<p>Web browsers receive HTML documents from a web server or from local storage and render the
documents into multimedia web pages. HTML describes the structure of a web page semantically and
originally included cues for its appearance.</p>

<p>HTML elements are the building blocks of HTML pages. With HTML constructs, images and other objects such
as interactive forms may be embedded into the rendered page. HTML provides a means to create structured documents
by denoting structural semantics for text such as headings, paragraphs, lists, links, quotes, and other items. HTML
elements are delineated by tags, written using angle brackets.</P>
  </body>
</html>
```
- 브라우저에게 어디서부터 어디까지가 하나의 단락이라는 것을 알려줄 때는 단락의 시작과 끝에 ```<p> ~~ </p>``` 태그를 위와 같이 감싸주면 됨 

**단락을 좀 더 많이 떨어뜨리고 싶을때**

- ```<br> ~~ </br>``` :  줄바꿈을 할때 사용하는 태그 (간격 넓힐 수 있음-> 줄바꿈 여러개 할 수 있음)

- ```<p> ~~ </p>``` 태그가 기본적으로 갖고 있는 태그의 디자인을 **CSS** 라고 하는 프로그래밍 언어를 통해 디자인을 변경할 수 있다. 
    - 즉, p 태그를 더 떨어뜨리거나 아니면 떨어뜨리지 않거나 이렇게 할 수 있다는 말

줄바꿈: br 태그
===
- 줄바꿈을 할 때는 p 태그를 써도 되지만 p 태그는 줄바꿈의 간격이 고정되어 있음
- 그래서 그런 경우에 우리는 br 태그를 통해서 좀 더 자유롭게 간격을 조정할 수 있음 
- 'A forced line-break(강제로 줄을 바꾼다)' 의 줄임말
- 줄바꿈을 몇 번 해라 이런식의 어떤 시각적인 것일 뿐임
    - p 태그같은 경우 단락으로 위 코드처럼 단락으로 묶어줬기 때문에 저렇게가 하나의 단락이다, 라는 **정보**를 표현할 수 있기 때문에 단락 표현시 -> p 태그 사용 권장


```
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
<br>HyperText Markup Language (HTML) is the standard markup language for documents designed to be
displayed in a web browser. It defines the content and structure of web content. It is often assisted by
technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript.</br>
<br>Web browsers receive HTML documents from a web server or from local storage and render the
documents into multimedia web pages. HTML describes the structure of a web page semantically and
originally included cues for its appearance.</br>

<br>HTML elements are the building blocks of HTML pages. With HTML constructs, images and other objects such
as interactive forms may be embedded into the rendered page. HTML provides a means to create structured documents
by denoting structural semantics for text such as headings, paragraphs, lists, links, quotes, and other items. HTML
elements are delineated by tags, written using angle brackets.</br>
  </body>
</html>

```
- 여기서 br 태그 같은 경우, 'void element' 라고 해서 내용이 없는 태그라는 뜻을 가짐
- 예를 들면 a 태그 같은 경우에는 어디서부터 어디까지가 a 태그인지를 지정해야 함 
- br 은 그냥 줄바꿈이란 뜻이기 때문에 이 줄바꿈 태그는 내용이 없다. -> 그냥 열리는 태그 하나만 있으면 됨
- **이 코드의 경우 p 태그는 줄바꿈이 두번 됐는데 br 태그는 줄바꿈이 한번만 됨**
- ***줄바꿈 하고 싶은 만큼 ```<br>태그 ``` 추가하면 됨!***

이미지를 웹페이지 안에 표시 : img
===
```
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <img src="img.jpg">
  </body>
</html>
```
- img 태그는 닫을 필요가 없음
- src 속성을 사용해서 img.jpg 파일 이름 적기
- 웹 브라우저는 **img 태그를 보고 여기에 이미지가 오겠구나**를 앎
- 웹 브라우저는 **src 라고 하는 것을 통해서 여기에는 img.jpg 라는 이미지를 표시해주면 되겠구나**를 앎

***width 속성 : 이미지 크기 변경시***
```
<html>
<body>
    <img src="img.jpg" width ="100">
  </body>
</html>
```
- width 를 예를들어 100이라고 하면 100 픽셀이라고 하는 컴퓨터에서 사용하는 길이 단위로 지정됨

***height 속성 : 높이 지정시***
```
<html>
<body>
    <img src="img.jpg" width ="100" height="300">
  </body>
</html>
```
- height 를 예를 들어 300 이라고 하면 폭이 200, 높이가 300 인 이미지가 된다.

여기서 만약 height(높이)만 300 으로 지정하게 되면 이미지의 높이를 300으로 하면서 그에 맞는 **적절한 폭의 길이를 웹브라우저가 자동으로 계산해서 표현**해줌 -> 이미지가 왜곡되는 현상이 사라짐

***alt 속성 : 이미지를 웹페이지에 포함할때***
```
<html>
<body>
    <img src="img.jpg"height="300 alt= "예시 이미지">
  </body>
</html>
```
- alt 는 'alternative text'(대안, 대체제) 의 약자
- 이미지가 깨지거나 사용할 수 없을 경우에 대안으로 사용할 수 있는 대체제

***title 속성 : 도움말***
```
<html>
<body>
    <img src="img.jpg"height="300 alt= "예시 이미지" title="예시 이미지">
  </body>
</html>
```
- 마우스를 올려놓았을때 이미지가 나오고, tooltip 이라는 것을 통해서 도움말이 나오게 하고 싶다면 title 속성사용 