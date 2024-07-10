Form 2
==
## ``Form Button``
+ button은 html에서 순수하게 쓸 수 없다

## ``reset``
+ ``<input type="reset">`` 

+ 사용자가 입력했던 모든 정보가 reset(재설정)된다

## ``hidden field``
+ 눈에 보이지 않지만 서버쪽으로 어떤 데이터를 전송할 때 사용하는 것

+ UI가 없지만 서버로 어떤 값을 전송하고 싶을 때 

## ``<label> ~~ </label>``
+ 무언가의 이름표

### for 속성
+ 누구의 이름표인지 연결 시켜줄때

+ 레이블이 누구의 레이블인지를 나타내고 싶다면 그 레이블에다가 아이디(id) 라고 하는 속성을 줘서 거기에 lable 의 for 에 넣은 id_txt 값이 들어간다

<br>

method
==

## Form
+ 사용자가 브라우저에 입력한 정보를 submit버튼을 누르면 어떤 특정한 서버의 url로 전송하는 것

## 데이터 전송하는 방법
+ get방식
    + url을 통해서 데이터를 전송하는 것

+ post방식
    + url이 아닌 다른 방법으로 데이터를 숨겨셔 전송하는 것

<br>

파일 업로드
==
``<input type="file">``
+ 파일을 선택하는 ui를 만드는 것도 input 태그를 이용한다

+ 파일을 업로드 하는 기능이 하나라도 있다면 enctype를 multipart/form-data로 지정해야 한다