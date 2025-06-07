package org.example

// 함수를 인자로 받는 고차 함수
fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

// 함수를 반환하는 함수
fun multiplier(factor: Int): (Int) -> Int {
    return { x -> x * factor }
}

// 커링 스타일
fun curriedAdd(a: Int): (Int) -> Int {
    return { b -> a + b }
}

fun main() {
    val sum = operate(10, 5) { x, y -> x + y }
    val diff = operate(10, 5) { x, y -> x - y }

    println("Sum: $sum")
    println("Difference: $diff")

    val timesTwo = multiplier(2)
    val timesThree = multiplier(3)

    println("2 * 10 = ${timesTwo(10)}")
    println("3 * 10 = ${timesThree(10)}")

    val addFive = curriedAdd(5)
    println("5 + 7 = ${addFive(7)}")
}
