package ir.alirahimi.testapp

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "aliiiw",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "ali",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "ali",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password was repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "ali",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less that 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "ali",
            "testPassword1",
            "testPassword1"
        )
        assertThat(result).isFalse()
    }
}