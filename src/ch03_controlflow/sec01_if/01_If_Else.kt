package ch03_controlflow.sec01_if

/**
 * 제어문: 코드의 흐름을 조건에 따라 바꿀 수 있음.
 * 제어문은 조건문에 해당하는 if, when
 * 그리고 반복문에 해당하는 for, while 이 있음
 */
fun main() {
    /*
     * 1. 조건문 if
     * 조건문: 주어진 조건식의 결과값이 참인지 거짓인지에 따라 코드를 실행할지
     * 다른 코드를 실행할지 판단하기 위한 프로그래밍 문법.
     *
     * - if 문을 사용하기 위한 조건
     * if 문의 조건식에는 비교 연산자와 논리 연산자를 사용한 조건식만 사용가능
     * 조건식의 결과는 boolean 타입인 true 참과 false 거짓으로 나타남
     *
     * 리턴형이 Boolean 인 변수나 함수도 가능
     */
    var out = 0
    var strike = 3
    if (strike > 2) { // 경고: 해당 조건식은 항상 참이라고 경고
        out += 1
    }
    println("out::$out") // 1

    var ball = 4
    if (ball > 3) { // 조건식이 참이면 {}안의 코드블럭이 실행
        println("4볼로 출루합니다.")
    } else { // 조건식이 거짓이면 이 코드블럭이 실행됨
        println("타석에서 타구를 기다립니다.")

    }

}