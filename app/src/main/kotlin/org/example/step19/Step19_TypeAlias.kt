package org.example.step19

// 함수 타입에 별칭 부여
typealias ClickHandler = (String) -> Unit

// 복잡한 Map 타입에 별칭
typealias UserMap = Map<String, List<Int>>

fun handleClick(handler: ClickHandler) {
    handler("Button clicked")
}

fun getUsers(): UserMap {
    return mapOf(
        "Alice" to listOf(1, 2),
        "Bob" to listOf(3)
    )
}

fun main() {
    // 함수 타입 호출
    handleClick { message -> println("Event: $message") }

    // 복잡한 Map 타입 사용
    val users = getUsers()
    for ((name, scores) in users) {
        println("$name: $scores")
    }
}
