package org.example.step3

// 일반 클래스
class Person(val name: String, var age: Int) {
    fun greet() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

// 데이터 클래스
data class Product(val id: Int, val name: String, val price: Double)

fun main() {
    // 일반 클래스 사용
    val person = Person("Alice", 30)
    person.greet()

    // 데이터 클래스 사용
    val product1 = Product(101, "Laptop", 1499.99)
    val product2 = product1.copy(price = 1299.99)

    println(product1) // 자동 toString
    println(product1 == product2) // equals
    println(product2) // copy with modified price
}
