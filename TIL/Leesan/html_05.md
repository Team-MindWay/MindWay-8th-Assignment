Form 1
==
+ 사용자가 입력한 정보를 서버로 전송할 때 사용하는 것들

## ``input 태그``
+ 사용자로부터 정보를 입력받을 수 있는 태그

+ type라는 속성으로 "text"를 하면 사용자로부터 문자 정보를 받을 수 있는 박스가 생김
    + input type="text"
+ type라는 속성에 "password"를 사용하면 글씨가 가려짐
    + input type="password"

+ type라는 속성에 "submit"을 사용하면 제출 버튼이 생김
    + input type="submit"

## ``Form 태그``

 ### **action 속성**
+ 사용자가 입력한 정보들이 submit버튼을 눌렀을 때 어디로 보낼 것인가

## ``value 속성``
+ 기본값을 정하고 싶을때

## ``<textarea> ~~ </textarea>``
+ 여러줄을 입력하고 싶을 때 

### cols
+ clumn(컬럼)의 줄임말

+ 글자열의 수

## ``dropdown List``
+ 제한된 공간 안에서 여래개의 선택지를 선택할수 있도록 해주는 기능

## ``option``
+ 선택할수 있는 것들 즉, 각각의 것들을 선택지로 정의한 것
    + option은 select태그와 함께 사용한다
### multiple 속성
+ 사용자가 여러개의 항목을 선택하고 싶을 때 사용

<br>

radio, checkbox
==
## ``radio 버튼``
+ 두개 동시에 누를수 있음

+ 네임값이 같은 것들끼리 groupng이 되는 것이고 같은 그룹에 속하는 것 중에 하나가 선택되면 나머지의 선택이 해제되는 형태

### value
+ 어떤 값이 돼야 되는지는 value로 적어줘야 함

## ``checkbox``
+ 같은 네임을 가지고 있는 여래 개의 컨트롤을 다중으로 선택할 수 있다

### checked 
+ 기본적으로 어떠한 항목이 선택되고 싶다