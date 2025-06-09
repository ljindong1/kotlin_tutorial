package org.example.step11

// 봉인 클래스
sealed class Result

data class Success(val data: String) : Result()
data class Error(val message: String) : Result()
object Loading : Result()

fun handle(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.data}")
        is Error -> println("Error: ${result.message}")
        Loading -> println("Loading...")
    }
}

fun main() {
    val r1: Result = Success("Data loaded")
    val r2: Result = Error("Something went wrong")
    val r3: Result = Loading

    handle(r1)
    handle(r2)
    handle(r3)
}
