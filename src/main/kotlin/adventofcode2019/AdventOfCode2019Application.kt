package adventofcode2019

import adventofcode2019.day1.Module
import adventofcode2019.day1.calculateTotalFuleCost
import adventofcode2019.day2.IntCodeComputer

fun main(args: Array<String>) {
    // Day 1
    val modules = readInputFile(1).lines().map { Module(it.toInt()) }
    println("Day 1: ${calculateTotalFuleCost(modules)}")

    // Day 2
    val day2IntCodeProgram = readInputFile(2)
    println("Day 2: ${IntCodeComputer(day2IntCodeProgram).run()}")
}

fun readInputFile(day: Int): String {
    return {}.javaClass.classLoader.getResource("day${day}-input.txt").readText()
}
