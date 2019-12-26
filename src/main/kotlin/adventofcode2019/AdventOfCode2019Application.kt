package adventofcode2019

fun main(args: Array<String>) {
    val modules = readInputFile(1).lines().map { Module(it.toInt()) }.toMutableList()
    println("Day 1: ${modules.calculateFuelCost()}")

    val day2IntCodeProgram = readInputFile(2)
    println("Day 2: ${IntCodeComputer(day2IntCodeProgram).run()}")

    val day3Input = readInputFile(3)
    println("Day 3: ${Wire(day3Input.lines()[0]).findMinimumDistance(Wire(day3Input.lines()[1]))}")

    println("Day 4: ${generatePossiblePassword(382345, 843167).size}")
}

fun readInputFile(day: Int): String {
    return {}.javaClass.classLoader.getResource("day${day}-input.txt").readText()
}
