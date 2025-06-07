package org.example

data class Person(val name: String, val age: Int)

fun getCoordinates(): Pair<Int, Int> {
    return Pair(10, 20)
}

fun main() {
    // 구조 분해: Pair
    val (x, y) = getCoordinates()
    println("x: $x, y: $y")

    // 구조 분해: data class
    val person = Person("Alice", 30)
    val (name, age) = person
    println("Name: $name, Age: $age")

    // Triple 사용
    val triple = Triple("One", 2, 3.0)
    val (a, b, c) = triple
    println("Triple: $a, $b, $c")

    // map에서 구조 분해 반복
    val map = mapOf("A" to 1, "B" to 2)
    for ((key, value) in map) {
        println("$key -> $value")
    }
}
