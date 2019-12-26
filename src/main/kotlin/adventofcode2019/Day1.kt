package adventofcode2019

import kotlin.math.floor

data class Module(val mass: Int)

fun MutableList<Module>.calculateFuelCost(): Double {
    return this.map { floor(it.mass / 3.0) -2 }.sum()
}