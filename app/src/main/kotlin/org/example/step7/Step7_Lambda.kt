package org.example.step7

fun main() {
    // 람다식 정의
    val greet: () -> Unit = { println("Hello Lambda") }
    greet()

    // 매개변수 있는 람다
    val square: (Int) -> Int = { x -> x * x }
    println("Square of 5: ${square(5)}")

    // 고차 함수
    fun operate(x: Int, y: Int, op: (Int, Int) -> Int): Int {
        return op(x, y)
    }

    val sum = operate(3, 4) { a, b -> a + b }
    val product = operate(3, 4) { a, b -> a * b }

    println("Sum: $sum")
    println("Product: $product")

    // 컬렉션 + 람다
    val items = listOf("Apple", "Banana", "Cherry")

    items.forEach { println("Fruit: $it") }

    val uppercased = items.map { it.uppercase() }
    println("Uppercased: $uppercased")
}
