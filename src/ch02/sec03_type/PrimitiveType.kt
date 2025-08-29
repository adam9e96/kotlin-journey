package ch02.sec03_type

// 정수 타입
fun main() {
    val one: Byte = 1 // OK
//    val tooBigForShort: Short = 100_000 // Error: too big for Short
    val million = 1_000_000 // OK: Int 타입으로 추론됨
//    val tooBigForSInt: Int = 10_000_000_000 // Error: too big for Int
    val tenBillions = 10_000_000_000 // OK: Long 타입으로 추론됨
//    val tooBigForLong = 10_000_000_000_000_000_000  // Error: too big for Long

    // 리터럴에 L이나 l을 붙이면 long 타입이 됨
    val hundredLong = 100L // OK: Long 으로 타입이 추론됨
//    val hundredInt: Int = 100L // Error: assigning Long to Int

    println(one)
    println(million)
    println(tenBillions)

    println(Int.MAX_VALUE) // 각 정수타입에는 최솟값과 최댓값을 포함하는 상수가 정의되어 있다.
    println(Int.MAX_VALUE+1) // 각 정수타입에는 최솟값과 최댓값을 포함하는 상수가 정의되어 있다.

}