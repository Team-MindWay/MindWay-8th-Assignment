Form: hidden
===
- 우리는 지금까지 서버 쪽으로 데이터를 전송하기 위해서 form 을 살펴봄 -> 데이터를 전송할 때 지금까지 우리가 살펴본 것들은 **눈에 보이는 ui(체크박스, 라디오 박스)** 가 있었음
-  ui 가 필요 없거나 몰래 서버쪽으로 데이터를 전송해야 되는 경우 -> **hidden field** 를 사용
```
<input type="text" name="id">
        <!--데이터를 전송한 것은 이 텍스트 필드라는 걸 통해서 전송한 것-->
        <input type="hidden" name="hide" value="engoing">
```
- ```<input type="text" name="id">``` 는 화면상에 표현됨
- ```<input type="hidden" name="hide" value="engoing">``` 는 화면상에 표시 되지 않음
    - type 값이 hidden 이기 때문에, 눈에 보이지는 않지만 name 은 'hide' 라고 하는 이름으로 **value는 'engoing' 이라는 값을 가지고 있는 어떤 것이 여기에 있음** -> 눈에 보이지 않을 뿐..

- 사람 눈에 보이지는 않지만 'submit' 버튼을 눌렀을 때 URL 로 hide 라고 하는 값은 'engoing' 이라고 하는 값이 전송된다. 