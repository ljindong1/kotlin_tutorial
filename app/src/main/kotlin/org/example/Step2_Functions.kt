package org.example

// 기본 인자와 네임드 파라미터
fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

// 표현식 형태 함수
fun sum(a: Int, b: Int): Int = a + b

fun main() {
    greet()           // 기본 인자 사용
    greet("Alice")    // 사용자 지정 인자
    println("Sum: ${sum(3, 7)}")
}
