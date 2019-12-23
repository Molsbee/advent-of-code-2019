package adventofcode2019

import adventofcode2019.day1.Module
import adventofcode2019.day1.calculateTotalFuleCost
import adventofcode2019.day2.IntCodeComputer
import adventofcode2019.day3.Wire
import adventofcode2019.day4.generatePossiblePassword

fun main(args: Array<String>) {
    // Day 1
    val modules = readInputFile(1).lines().map { Module(it.toInt()) }
    println("Day 1: ${calculateTotalFuleCost(modules)}")

    // Day 2
    val day2IntCodeProgram = readInputFile(2)
    println("Day 2: ${IntCodeComputer(day2IntCodeProgram).run()}")

    // Day 3
    val day3Input = readInputFile(3)
    println("Day 3: ${Wire(day3Input.lines()[0]).findMinimumDistance(Wire(day3Input.lines()[1]))}")

    println("Day 4: ${generatePossiblePassword(382345, 843167).size}")
}

fun readInputFile(day: Int): String {
    return {}.javaClass.classLoader.getResource("day${day}-input.txt").readText()
}
