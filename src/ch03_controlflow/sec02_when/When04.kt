package ch03_controlflow.sec02_when

/*
 * 범위 값 비교
 * in 을 사용해서 범위 값을 비교할 수 있음
 * if 문의 비교 연산자 <=, >= 와 같음
 */
fun main() {
    val ageOfMeeco = 19
    when (ageOfMeeco) {
        // between a and b 와 유사
        in 10..19 -> {
            println("마이클은 10대입니다.")
        }

        !in 10..19 -> {
            println("마이클은 10대가 아닙니다.")
        }

        else -> {
            println("마이클의 나이를 알 수 없습니다.")
        }
    }
}