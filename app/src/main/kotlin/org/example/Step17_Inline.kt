package org.example

// inline 함수: 함수 본문이 호출 지점에 인라인됨
inline fun measureTime(block: () -> Unit) {
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("Elapsed time: ${(end - start) / 1_000_000} ms")
}

// inline + noinline: 일부만 인라인 방지
inline fun process(noinline op: () -> Unit, message: () -> Unit) {
    println("Start")
    op()
    message()
    println("End")
}

// crossinline: 람다 안에서 return 불가
inline fun runTask(crossinline task: () -> Unit) {
    val runnable = Runnable {
        task() // 안전하게 비지역 return 방지
    }
    runnable.run()
}

fun main() {
    measureTime {
        Thread.sleep(100)
    }

    process(
        op = { println("Doing work...") },
        message = { println("All done!") }
    )

    runTask {
        println("Running task safely")
        // return 안됨: crossinline
    }
}
