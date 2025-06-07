package org.example

// 객체 선언 (Singleton)
object Logger {
    fun log(message: String) {
        println("LOG: $message")
    }
}

// 클래스 + Companion Object
class MathUtils {
    companion object {
        fun square(x: Int): Int = x * x
        fun cube(x: Int): Int = x * x * x
    }
}

fun main() {
    // Singleton 사용
    Logger.log("Hello Kotlin Object")

    // Companion Object 메서드 사용
    println("Square: ${MathUtils.square(5)}")
    println("Cube: ${MathUtils.cube(3)}")
}
