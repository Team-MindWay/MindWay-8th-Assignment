표(table): 기본
===
**!!! ```<table> ~~ </table>``` 태그로 묶어주기!!!**

 하나의 열: td 태그
---
- td 는 table 들의 data
- 항복 하나하나를 td 라는 이름으로 묶어주면 됨
- td는 **테이블 데이터(table data)** 의 약자
    - 즉, 표에서 각각의 실제 데이터들을 의미함
    ```
      </head>
  <body>
    <<td>이름</td> <td>성별</td> <td>주소</td>
    <td>최진역</td> <td>남</td> <td>청주</td>
    
  </body>
  ```
    - 정보 부족 -> '이름, 성별, 주소' 가 하나의 행이 되고, '최진혁 남자 청주'는 그 밑의 행으로 내려가야함
    - **같은 행들을 그룹핑(Grouping)** 시켜줘야 함
    - 마치 li 를 ul이나 ol 로 묶은 것 처럼

하나의 행: tr 태그
---
- tr 은 테이블(table) 로우(행)(row)의 약자 
- 즉, 같은 행에 속하는 td 태그들을 tr 이라는 태그로 묶어주면 웹브라우저는 tr 아래에 있는 td들을 같은 행으로 표시
```
<<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <table>
    <tr>
    <<td>이름</td> <td>성별</td> <td>주소</td>
    </tr>
    <tr>
    <td>최진역</td> <td>남</td> <td>청주</td>
    </tr>
    <tr>
    <td>최유빈</td> <td>여</td> <td>청주</td>
    </tr>
    </table>
  </body>
</html>
```

테두리 추가: border 속성
--
- 테이블이라는 태그에 이 속성 중 **border(테두리)** 이라는 속성이 있음
```
<table border="2"
```
- 숫자가 증가하면 테두리가 더 두껍게 표시 됨
```
  <body>
    <table border="2">
    <tr>
    <<td>이름</td> <td>성별</td> <td>주소</td>
    </tr>
    <tr>
    <td>최진역</td> <td>남</td> <td>청주</td>
    </tr>
    <tr>
    <td>최유빈</td> <td>여</td> <td>청주</td>
    </tr>
    </table>
  </body>
```

표(table): 구조
===

- 태그는 정보를 규정하는 정의하는 역할을 하는 것이기 때문에 어떤 웹페이지에 있는 정보를 좀 더 가치있게 만들려면 정보들을 잘 구조화 하고 표현할 필요가 있음 -> **태그를 통해서**

구조화: thead 태그 , tbody 태그
---
- thead 의 t 는 table 의 약자 head : 헤드 부분
- tbody 의 t 는 table 의 약자 body : 본문 부분
- tfoot 의 t 는 table 의 약자 food : 마지막 부분
```
<thead>
  <tr>
    <td>이름</td> <td>성별</td> <td>주소</td>
    </tr>
    </thead>

    <tbody>
    <tr>
    <td>최진역</td> <td>남</td> <td>청주</td><td>1000</td>
    </tr>
    <tr>
    <td>최유빈</td> <td>여</td> <td>청주</td><td>500</td>
    </tr>
    </tbody>
    <tfoot>
    <tr>
    <td>합계</td> <td></td> <td></td> <td>1500</td>
    </tr>
    </tfoot>
```
- **td를 th 로 바꾸면 th 로 되어있는 각각의 칸들이 진하게 표시됨**

- thead 가 있는 부분으로 tfoot 부분이 들어간다고 해도 표상에서 가장 아래쪽으로 내려가게 됨
- thead 와 tbody 그리고 tfoot 는 table 에 있는 데이터들의 **어떤 위치 같은 것들을 결정**하는 역할을 함!

표(table): 병합
===
- 중복되는 부분 or 불필요한 공백 구분을 없앨 때 사용

수직(행)으로 병합하고자 하는 부분 : rowspan 속성
---
```
 <tr>
 <td>최진역</td> <td>남</td> <td rowspan="2">청주</td>
 </tr>
<tr>
<td>최유빈</td> <td>여</td> <td>청주</td>
</tr>
```
- 두개의 행이 병합된다는 뜻
- 브라우저 입장에서는 윗줄의 청주와 윗줄의 청주를 기준으로 해서 두 개의 행이 병합 된다면 아랫줄의 청주가 병합의 대상이 된다 -> **그럼 ```<td>최유빈</td> <td>여</td> <td>청주</td>``` 의 청주부분 삭제**
- 앞 부분은 행과 행(수직)을 합친다 -> 수평의 방향성

수평(열)으로 병합하고자 하는 부분: colspan 속성
---
```
 <tfoot>
 <tr>
<td colspan="3">합계</td>  <td>1500</td>
</tr>
</tfoot>
```
- 맨 첫부분(합계)부터 시작해서 뒤에 나오는 세개의 ```<td> ~~ </td>``` 컬럼이 합쳐진것이다 라는 뜻을 의미