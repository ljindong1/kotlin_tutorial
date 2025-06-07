package org.example

fun main() {
    // 리스트 (순서 있음, 중복 허용)
    val fruits = listOf("Apple", "Banana", "Cherry")
    val mutableFruits = mutableListOf("Apple")
    mutableFruits.add("Banana")

    println("Fruits: $fruits")
    println("Mutable Fruits: $mutableFruits")

    // 집합 (순서 없음, 중복 불가)
    val numbers = setOf(1, 2, 3, 2)
    val mutableNumbers = mutableSetOf(1, 2)
    mutableNumbers.add(3)
    mutableNumbers.add(2) // 이미 있음, 무시됨

    println("Numbers: $numbers")
    println("Mutable Numbers: $mutableNumbers")

    // 맵 (키-값)
    val capitals = mapOf("Korea" to "Seoul", "USA" to "Washington")
    val mutableCapitals = mutableMapOf("Japan" to "Tokyo")
    mutableCapitals["France"] = "Paris"

    println("Capitals: $capitals")
    println("Mutable Capitals: $mutableCapitals")

    // 반복문
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    for ((country, capital) in capitals) {
        println("The capital of $country is $capital")
    }
}
