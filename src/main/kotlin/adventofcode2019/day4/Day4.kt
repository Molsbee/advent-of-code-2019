package adventofcode2019.day4

fun generatePossiblePassword(start: Int, end: Int): List<Int> {
    val possiblePasswords = mutableListOf<Int>()
    for (i in start until end) {
        if (validLength(i) && validAdjacentCharacters(i) && validNeverDecreasing(i)) {
            possiblePasswords.add(i)
        }
    }
    return possiblePasswords
}

private fun validLength(num: Int): Boolean {
    if (num in 100000..999999) {
        return true
    }
    return false
}

private fun validAdjacentCharacters(num: Int): Boolean {
    var previousNumber: Int? = null
    parseInt(num).forEach {
        if (previousNumber != null && it == previousNumber!!) {
            return true
        }
        previousNumber = it
    }

    return false
}

private fun validNeverDecreasing(num: Int): Boolean {
    var previousNumber: Int? = null
    parseInt(num).forEach {
        if (previousNumber != null && it < previousNumber!!) {
            return false
        }
        previousNumber = it
    }

    return true
}

private fun parseInt(num: Int): List<Int> {
    return mutableListOf(
            (num / 100000) % 10,
            (num / 10000) % 10,
            (num / 1000) % 10,
            (num / 100) % 10,
            (num / 10) % 10,
            num % 10
    )
}