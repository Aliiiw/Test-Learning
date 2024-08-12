package ir.alirahimi.testapp

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun `add two numbers`() {
        val calculator = Calculator()
        val result = calculator.add(17, 2)
        assertEquals(19, result)
    }

    @Test
    fun `subtract two numbers`() {
        val calculator = Calculator()
        val result = calculator.subtract(17, 2)
        assertEquals(15, result)
    }

    @Test
    fun `multiply two numbers`() {
        val calculator = Calculator()
        val result = calculator.multiply(17, 2)
        assertEquals(34, result)
    }

    @Test
    fun `divide two numbers`() {
        val calculator = Calculator()
        val result = calculator.divide(17, 2)
        assertEquals(8, result)
    }

}