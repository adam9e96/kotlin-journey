package ch02.sec03_type

// 기본 문자열 연산
fun main() {
    val s = "Hello!"
    println(s.length) // 6
    println(s.lastIndex) // 5 (인덱스는 0부터 시작하므로)

    // 문자열은 인덱스를 [] 를 이용해 개별 문자에 접근할 수 있다.
    val s2 = "Hello!"
    println(s2[0]) // H
    println(s2[1]) // e
    println(s2[2]) // l
    println(s2[4]) // l
    println(s2[5]) // o

    // 두 문자열 연결도 가능함
    val sum = 33
    val s3 = "The sum is: $sum" // + 연산자를 써도 된다
    println(s3)

    // 코틀린은 자바와 다르게 문자열을 비교할때 ==, != 을 사용해
    // 동등성을 비교할 수 있다.
    // 문자열의 내용을 비교하므로, 서로 다른 두 객체의 인스턴스를 비교해도
    // 문자의 순서들의 순서와 길이가 같으면 같은 문자열로 간주한다.
    val str1 = "Hello!"
    val str2 = "Hel" + "lo!"
    println(str1 == str2) // true

    // 이게 되는 이유
    // 자바의 ==, != 연산자는 참조 동등성을 비교하기 때문에 문자열 내용을 비교하려면 equals() 메서드를 사용해야함
    // 코틀린에서는 ==가 기본적으로 equals()를 가르키는 편의 문법이기 때문에 == 을 사용하면 직접
    // equals()를 호출하므로, 굳이 equals()를 호출할 필요는 없다.

    // 코틀린에서 참조 동등성을 쓰고 싶다면?
    // === , !== 연산자를 사용하면 된다.


    // 문자열은 사전식 순서로 정렬됨 그래서 <, >, <=, >= 연산자로 문자열 비교가 가능함
    println("abc" < "cba") // true
    println("123" > "34") // false

}