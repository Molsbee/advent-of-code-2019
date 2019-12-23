package adventofcode2019.day1

import kotlin.math.floor

data class Module(val mass: Int)

fun calculateTotalFuleCost(modules: List<Module>): Double {
    return modules.map { floor(it.mass / 3.0) - 2 }.sum()
}