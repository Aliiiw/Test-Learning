package ir.alirahimi.testapp

import ir.alirahimi.testapp.MainActivity.Companion.reverseString
import org.junit.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    //fun name _test for naming
    //with ``
    @Test
    fun reverseString_test() {

    }

//    @Test
//    fun `reverseString should return reversed string`(){
//
//        // Arrange
//        val testCase = "alirahimi"
//
//        // Act
//        val result = reverseString(testCase)
//
//        // Assert
//        val reversed = "imiharila"
//        assertEquals(reversed, result)
//
//    }

    @Test
    fun `reverseString should return reversed string`() {


        // Arrange
        val testCases = mapOf(
            "alirahimi" to "imiharila",
            "test" to "tset",
            "hih" to "hih",
            "12345" to "54321",
            "" to ""
        )
        
        for ((input, expected) in testCases) {
            // Act
            val result = reverseString(input)
            // Assert
            assertEquals(expected, result)
        }
    }
}