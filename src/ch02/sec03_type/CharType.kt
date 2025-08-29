package ch02.sec03_type

fun main() {

    val z = 'z'
    val alpha = 'a'

    println(z)
    println(alpha)

    // Char은 그냥 문자 코드일 뿐이지만 코틀린은 Char 자체를 수 타입으로 취급하지 않는다.
    // 하지만 유니코드 문자 집합 내에서의 몇 가지 산술 연산은 허용한다.
    // +/- 연산자를 이용해 문자의 수를 더하거나 뺄 수 있음
    var a = 'a'
    var h = 'h'
    println(a + 5) // f 출력
    println(a - 5) // \
    // 자바에서는 문자(char)에 대한 산술 연산 결과가 암시적으로 정수로 변환된다.
    println(++a)


}