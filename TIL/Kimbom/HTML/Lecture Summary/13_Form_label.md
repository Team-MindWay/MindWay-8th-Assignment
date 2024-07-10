Form: label
===
- html 에서 권장하는 방법
```
<lable>text</lable> :
    <input type="text" name="id" value="default value">
```
- 텍스트(text:) 라고 하는 것이 인풋(input) 태그에 대한 레이블(label)이다. -> **무언가의 이름표** 라는 의미를 가짐
    - 특별한 의미가 있다기 보단 정보에 대해 기술

for 속성 사용
---
- **누구의 이름표인지 분명하지 않을때**
```
    <lable for="id_txt">text</lable> :
```
- 레이블이누구의 레이블인지를 나타내고 싶다면 그 레이블에다가 아이디(id) 라고 하는 속성을 줘서 거기에 lable 의 for 에 넣은 id_txt 값이 들어간다.
```
<lable for="id_txt">text</lable> :
    <input id="id_txt" type="text" name="id" value="default value">
```
- 시각적으로 보이는 것은 변화가 전혀 없다 -> but 기능상의 차이가 생김(예로 text: 라는 텍스트를 클릭 했을 때, 텍스트 필드에 커서가 위치)
```
<p>
    <lable for="id_txt">text</lable> :
    <input id="id_txt" type="text" name="id" value="default value">
   </p>
   <p>
    <labe for="password">password</labe>:
    <input id="password" type="password" name="pwd" value="default value">
   </p>
   <p>
    <label for="comment">textarea </label>:
    <textarea id="comment" rows="2">default value<textarea>
   </p>
```
**레이블(text,password,textarea) == 텍스트 필드의 레이블**

- 만약 id 값을 쓰는 것이 귀찮다면 그냥 label로 묶어주기
```
<label>textarea: 
    <textarea rows="2">default value</textarea>
</label>
```
- 레이블 태그 안에 있는 폼 태그의 바깥쪽에 있는 텍스트들이 레이블이 되는 것

**이 두개는 표현 방법이 다를 뿐이지, 실제로는 같은 일을 한거라고 볼 수 있다.**




