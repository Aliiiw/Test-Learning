package ir.alirahimi.testapp

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class StringTest {

    @Test
    fun testStringEquality() {
        val actual = "ali rahimi"
        assertThat(actual).isEqualTo("ali rahimi")
    }

    @Test
    fun testStringContains() {
        val actual = "ali rahimi"
        assertThat(actual).contains("ali")
    }

    @Test
    fun testStringStartsWith() {
        val actual = "ali rahimi"
        assertThat(actual).startsWith("a")
    }

    @Test
    fun testStringEndsWith() {
        val actual = "ali rahimi"
        assertThat(actual).endsWith("i")
    }

    @Test
    fun testStringIsNotEmpty() {
        val actual = "ali rahimi"
        assertThat(actual).isNotEmpty()
    }
}




