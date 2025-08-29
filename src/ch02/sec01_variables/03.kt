package ch02.sec01_variables

fun main() {

    var x = 10
    var y = 5
    val c = x;
//    println("X: " + x + ", y: " + y + ", c: " +c)
    println("X: $x, Y: $y, C: $c")

    var temp = x;
    x = y
    y = temp
    println("X: $x, Y: $y, C: $c")

}