package adventofcode2019.day2

import adventofcode2019.IntCodeComputer
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

class IntCodeComputerTest {

    private val testData = listOf(
            "1,0,0,0,99" to "2,0,0,0,99",
            "2,3,0,3,99" to "2,3,0,6,99",
            "2,4,4,5,99,0" to "2,4,4,5,99,9801",
            "1,1,1,4,99,5,6,0,99" to "30,1,1,4,2,5,6,0,99"
    )

    @TestFactory
    fun testInputOutput() = testData
            .map { (input, expected) ->
                DynamicTest.dynamicTest("when executing $input then I get $expected") {
                    val output = IntCodeComputer(input).run()
                    Assertions.assertEquals(expected, output)
                }
            }
}