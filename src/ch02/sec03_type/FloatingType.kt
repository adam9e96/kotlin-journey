package ch02.sec03_type

fun main() {
    // 코틀린에는 자바와 마찬가지로 Float와 Double를 제공한다.

    val pi = 3.14
    val one = 1.0

    val quarter = .25 // 0.25로 간주됨 실수타입에서 정수 부분을 비우면 0으로 간주함
//    val two = 2.  // Error: Expecting an element , 소수점을 남기면서 소수부분 생략은 안됨
    val three = 3 // 오류는 아니지만, 실수가 아님 정수 리터럴이됨

    // 코틀린은 과학적 표기법을 지원함 e, E위에 10 거듭제곱 표기법
    val pi2 = 0.314E1 // 3.14 = 0.314*10
    val pi100 = 0.314E3  // 314.0 = 0.314*1000
    val pi10ver100 = 3.14E-2 // 0.0314 = 3.14/100
    val thousand = 1E3 // 1000.0 = 1*1000

    println(pi)
    println(one)
    println(quarter)
    println(three)
    println("=====")
    println(pi2)
    println(pi100)
    println(pi10ver100)
    println(thousand)

    println("=====")
    // 코틀린 부동소수점 리터럴은 Double 타입이나 f나 F를 붙이면 Float 타입이 된다.
    val pi3 = 3.14f
    val one2 = 1f // f를 붙이면 소수점 생략가능 1.0
    println(pi3)
    println(one2)


}