package org.example

data class User(val id: Int, val name: String)

class UserClass(val id: Int, val name: String)

fun main() {
    val user1 = User(1, "Alice")
    val user2 = User(1, "Alice")
    val user3 = user1

    println("user1 == user2: ${user1 == user2}")   // true (값 비교)
    println("user1 === user2: ${user1 === user2}") // false (참조 비교)
    println("user1 === user3: ${user1 === user3}") // true

    println("user1: $user1") // toString 자동 생성

    val uc1 = UserClass(1, "Alice")
    val uc2 = UserClass(1, "Alice")

    println("UserClass uc1 == uc2: ${uc1 == uc2}") // false (참조 비교)
}
