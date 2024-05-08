fun main() {
  val word = "마인드웨이" //word[0] = 마 word[1] 인  word[2] = 드  word[3] = 웨  word[4] = 이
  val length = word.length

  for (i in 0 until length) { //변수 i를 변수 length부터 0까지 반복
      var output = "" // 변수 output을 선언 및 초기화
      for (j in i until length) { //변수 j을 i까지 반복
          output += word[j]// output에 word의 j번쨰 글자를 저장
      }
      for (j in 0 until i) // 변수 j가 0부터 i까지 반복
      {
          output += word[j]// output에 word의 j번째 글자를 저장
      }
      println(output)//output을 출력
  }
}  