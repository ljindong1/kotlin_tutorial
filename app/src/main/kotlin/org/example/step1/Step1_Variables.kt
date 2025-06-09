package org.example.step1

fun main() {
    val name = "Kotlin" // 변경 불가
    var age = 5         // 변경 가능

    println("Name: $name")
    println("Age: $age")

    age = 6
    println("Updated Age: $age")
}