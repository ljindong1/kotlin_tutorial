package org.example.step15

// 제네릭 함수
fun <T> printList(items: List<T>) {
    for (item in items) {
        println(item)
    }
}

// 제네릭 클래스
class Box<T>(val value: T) {
    fun get(): T = value
}

// 타입 제한 (T는 Comparable을 구현해야 함)
fun <T : Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {
    printList(listOf("Apple", "Banana", "Cherry"))
    printList(listOf(1, 2, 3, 4))

    val intBox = Box(123)
    val strBox = Box("Kotlin")

    println("IntBox: ${intBox.get()}")
    println("StrBox: ${strBox.get()}")

    println("Max: ${findMax(10, 20)}")
    println("Max: ${findMax("Zoo", "Apple")}")
}
