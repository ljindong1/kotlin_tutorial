package org.example.step4

fun main() {
    val score = 85

    // if-else
    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else {
        println("Grade: C or below")
    }

    // when 표현식
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "F"
    }
    println("Computed grade: $grade")

    // for loop
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // while loop
    var i = 5
    while (i > 0) {
        print("$i ")
        i--
    }
    println()

    // do-while loop
    var j = 1
    do {
        print("$j ")
        j++
    } while (j <= 3)
    println()
}
