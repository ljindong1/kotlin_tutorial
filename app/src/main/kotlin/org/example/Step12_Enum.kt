package org.example

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

enum class Planet(val mass: Double) {
    EARTH(5.97),
    MARS(0.642),
    JUPITER(1898.0);

    fun isHeavy(): Boolean = mass > 1.0
}

fun printDirection(dir: Direction) {
    when (dir) {
        Direction.NORTH -> println("Going up")
        Direction.SOUTH -> println("Going down")
        Direction.EAST -> println("Going right")
        Direction.WEST -> println("Going left")
    }
}

fun main() {
    val dir = Direction.EAST
    printDirection(dir)

    val p = Planet.JUPITER
    println("Planet: ${p.name}, Mass: ${p.mass}, Is heavy? ${p.isHeavy()}")

    println("All Directions:")
    for (d in Direction.values()) {
        println("- $d (index=${d.ordinal})")
    }
}
