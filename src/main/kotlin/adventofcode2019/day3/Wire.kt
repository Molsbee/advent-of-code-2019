package adventofcode2019.day3

import java.lang.RuntimeException
import kotlin.math.abs

data class Position(val x: Int, val y: Int) {
    fun calculateDistance(): Int {
        return abs(x) + abs(y)
    }
}

class Wire(private val input: String) {
    private val startPosition = Position(0, 0)
    var positions = mutableListOf<Position>()

    init {
        var currentPosition = startPosition

        val routes = input.split(",")
        routes.forEach {
            val direction = it.first()
            val distance = it.drop(1).toInt()
            when (direction) {
                'R' -> {
                    repeat(distance) {
                        currentPosition = Position(currentPosition.x + 1, currentPosition.y)
                        positions.add(currentPosition)
                    }
                }
                'U' -> {
                    repeat(distance) {
                        currentPosition = Position(currentPosition.x, currentPosition.y + 1)
                        positions.add(currentPosition)
                    }
                }
                'L' -> {
                    repeat(distance) {
                        currentPosition = Position(currentPosition.x - 1, currentPosition.y)
                        positions.add(currentPosition)
                    }
                }
                'D' ->  {
                    repeat(distance) {
                        currentPosition = Position(currentPosition.x, currentPosition.y - 1)
                        positions.add(currentPosition)
                    }
                }
                else -> throw RuntimeException("Unknown direction provided: ${direction}")
            }
        }
    }

    fun findMinimumDistance(wire: Wire): Int {
        return this.positions.intersect(wire.positions).map { it.calculateDistance() }.sorted()[0]
    }

}