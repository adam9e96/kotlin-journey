package ch03_controlflow.sec02_when

fun main() {
    val result = 20

    // 인자 없은 when
    when {
        result > 50 -> {
            println("A")
        }

        result > 40 -> {
            println("B")
        }

        result > 30 -> {
            println("C")
        }

        result > 20 -> {
            println("D")
        }

        else -> {
            println("F") // 결과: F
        }
    }
}