package org.example.step14

data class Person(var name: String, var age: Int)

fun main() {
    val person = Person("Alice", 25)

    // let: it 사용, 결과 반환
    val nameLength = person.let {
        println("Let: ${it.name}")
        it.name.length
    }
    println("Name length: $nameLength")

    // run: this 사용, 마지막 식 반환
    val greeting = person.run {
        "Hi, I'm $name and I'm $age years old"
    }
    println(greeting)

    // also: it 사용, 원본 객체 반환
    val modified = person.also {
        println("Before: $it")
        it.age += 1
    }
    println("After also: $modified")

    // apply: this 사용, 원본 객체 반환
    val updated = person.apply {
        name = "Bob"
        age = 30
    }
    println("After apply: $updated")

    // with: 외부 객체를 this로 사용
    val description = with(person) {
        "Person(name=$name, age=$age)"
    }
    println(description)
}
