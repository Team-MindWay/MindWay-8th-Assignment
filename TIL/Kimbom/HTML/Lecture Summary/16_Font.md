HTML - font
===
- html이 처음 등장 했을 때 약 18개의 태그로 시작하여 현 시점에서는 150개 정도의 태그 존재(**font 태그는 퇴출**)
폰트 태그 작성시)
```
<font size="7" color="red">Hello</font>world
```

폰트 태그가 부적절한 이유
---
예)
```
<h1>HTML</h1> <!---가장 큰 제목--!>

<ol> <!--하위에 있는 li이 들이 같은 그룹에 속해 있음 --!>
<li>기술 소개</li>
li>기본 문법</li>
</ol>
```
- h1 이나 ol 태그 등은 각각의 의미를 담고 있찌만 ```<font size="7" color="red">Hello</font>world``` 이거는 그냥 시각적인 정보일 뿐이지 Hello 라고 하는 저 정보에 대해서 어떤 설명도 하고 있지 않음
    - 만약, 이 웹페이지에 Hello wolrd 라고 하는 빨간색 문자와 그냥 검은색 문자가 여러 번 등장한다고 하면... -> html 파일의 용량도 커지고 html 디자인과 관련된 코드와 어떤 의미를 가지고 있는(li, h1) 같은 코드가 혼재 -> 웹페이지 해석하기 어려워짐(웹페이지 정보로서의 가치가 현저히 떨어지는 것)

