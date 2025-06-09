package org.example.step8

// 확장 함수: String에 기능 추가
fun String.firstChar(): Char = this[0]

// 확장 프로퍼티: String의 길이 2배 반환
val String.doubleLength: Int
    get() = this.length * 2

// 확장 함수: Int 제곱
fun Int.squared(): Int = this * this

fun main() {
    val name = "Kotlin"

    println("First char: ${name.firstChar()}")
    println("Double length: ${name.doubleLength}")

    val number = 7
    println("Squared: ${number.squared()}")
}
