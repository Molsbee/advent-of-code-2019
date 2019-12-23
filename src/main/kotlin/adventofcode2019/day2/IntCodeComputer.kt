package adventofcode2019.day2

class OpCodeException(message: String): Exception(message)

class IntCodeComputer(var program: String) {
    var intCodes = program.split(",").map { it.toInt() }.toMutableList()

    fun run(startingPosition: Int = 0): String {
        when (val opCode = intCodes[startingPosition]) {
            1 -> {
                val inputPosition1 = intCodes[startingPosition + 1]
                val inputPosition2 = intCodes[startingPosition + 2]

                val outputPosition = intCodes[startingPosition + 3]
                intCodes[outputPosition] = add(intCodes[inputPosition1], intCodes[inputPosition2])
                run(startingPosition + 4)
            }
            2 -> {
                val inputPosition1 = intCodes[startingPosition + 1]
                val inputPosition2 = intCodes[startingPosition + 2]
                val outputPosition = intCodes[startingPosition + 3]

                intCodes[outputPosition] = multiply(intCodes[inputPosition1], intCodes[inputPosition2])
                run(startingPosition + 4)
            }
            99 -> return intCodes.joinToString(separator = ",")
            else -> {
                throw OpCodeException("Unable to process Opcode $opCode")
            }
        }
        return intCodes.joinToString(separator = ",")
    }


    private fun add(a: Int, b: Int): Int {
        return a + b
    }

    private fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

