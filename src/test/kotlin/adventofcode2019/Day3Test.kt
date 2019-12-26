package adventofcode2019

import adventofcode2019.Wire
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day3Test {

    @Test
    fun scenario1() {
        val wire1 = Wire("R75,D30,R83,U83,L12,D49,R71,U7,L72")
        val wire2 = Wire("U62,R66,U55,R34,D71,R55,D58,R83")

        val distance = wire1.findMinimumDistance(wire2)

        Assertions.assertEquals(159, distance)
    }

    @Test
    fun scenario2() {
        val wire1 = Wire("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51")
        val wire2 = Wire("U98,R91,D20,R16,D67,R40,U7,R15,U6,R7")

        val distance = wire1.findMinimumDistance(wire2)

        Assertions.assertEquals(135, distance)
    }

}