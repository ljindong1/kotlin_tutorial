package org.example.step13

fun riskyDivide(a: Int, b: Int): Int {
    if (b == 0) throw IllegalArgumentException("Cannot divide by zero")
    return a / b
}

fun main() {
    try {
        val result = riskyDivide(10, 0)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Caught exception: ${e.message}")
    } finally {
        println("Finally block always runs")
    }

    // Kotlin 스타일: runCatching
    val safeResult = runCatching {
        riskyDivide(10, 2)
    }.getOrElse {
        -1
    }
    println("Safe result: $safeResult")
}
