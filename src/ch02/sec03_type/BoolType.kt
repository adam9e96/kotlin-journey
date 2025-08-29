package ch02.sec03_type

fun main() {
    // 불타입과 논리 연산
    val hasErrors = false;
    val testPassed = true;
    // 자바와 마찬가지로 코틀린 Boolean 도 수 타입과는 다른 타입이다.
    // 불타입은 ! , or, and, xor, ||, && 연산을 지원함
    // 자바와 달리 &와 | 연산자를 지원하지 않고 and 와 or이 각각 & 와 | 를 대신함.


    println(hasErrors) // false
    println(testPassed) // true


    var x = 1
    var y = 1
    println((x == 1) or (y == 1)) // true
    println((x == 0) || (y == 0)) // false
    println((x == 1) and (y != 1)) // true
    println((x == 1) and (y == 1)) // true

}