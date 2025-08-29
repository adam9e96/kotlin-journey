package ch02.sec03_type

import java.util.Date

fun main() {
    // 문자열 템플릿
    val hello = "Hello, World"
    val text = "hello, world \n This \"multiline\" String"
//    println(text)

    // 리터럴은 자바 문자열과 같지만 더 강력하다
    val name = readln() // 키보드로 문자열을 입력받음
    println("Hello, $name!\n Today is ${Date()}")

    // 코틀린은 기본적으로 ${} 의 중괄호 사이에 넣기만 하면, 어떤 코틀린 식이든 문자열에 넣을 수 있다.
    // $name 과 같이 식이 간단한 참조 변수인 경우 중괄호를 생략하고 달러 기호만 붙여도 된다.
    // -> 이런 기능을 문자열 템플릿(string template)이라고 함

    // trimIndent는 자동으로 붙는데 여러줄에 공통된 최소 들여쓰기를 제거해주는 표준 코들린 함수이다
    val message = """
        Hello, $name
    """.trimIndent()

    println(message)

    val message2 = """
        This is triple quote: '${"\"\"\"\""}'
    """.trimIndent()

    println(message2)
}