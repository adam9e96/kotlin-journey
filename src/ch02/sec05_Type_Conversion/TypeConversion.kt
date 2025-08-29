package ch02.sec05_Type_Conversion

fun main() {
    // 코틀린은 toInt(), toLong() 등 각 타입마다 변환하는 타입변환하는 메서드를 제공함
    // 다만 자바와 달리 코틀린에서는 범위가 큰 타입이 사용돼야 하는 문맥에 범위가 작은 타입이 못들어감
    val n = 100 // Int
//    val l: Long = n // Error: can't assign Int to Long
    val l:Long = 100
    // 이렇게 된 이유
    // 암시적인 박싱 때문에 막음
    // 일반적인 Int값이 꼭 원시 타입으로 표현된다는 보장이 없다.
    // 작은타입이 큰 범위의 타입으로 변환할때 다른 박싱한 타입의 값을 만들어낼 가능성이 있어서 막았다!
}