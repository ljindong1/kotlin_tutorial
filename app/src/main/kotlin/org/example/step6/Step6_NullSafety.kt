package org.example.step6

fun main() {
    // Nullable 선언
    var name: String? = "Kotlin"
    println("Length: ${name?.length}") // 안전 호출

    name = null
    println("Length (null-safe): ${name?.length}") // null이면 null 반환

    // 엘비스 연산자
    val length = name?.length ?: 0
    println("Length with Elvis: $length") // null이면 0 반환

    // !! 단언 연산자 (null이면 예외 발생)
    // val crash = name!!.length // NullPointerException 발생

    // null 체크 후 스마트 캐스트
    if (name != null) {
        println("Upper: ${name.uppercase()}") // name은 non-null로 간주됨
    }

    // let: null이 아닐 때만 블록 실행
    name = "Kotlin"
    name?.let {
        println("Let block: $it is not null")
    }

    // takeIf와 run
    val input: String? = "Hello"
    input?.takeIf { it.length > 3 }?.run {
        println("Valid input: $this")
    }
}
