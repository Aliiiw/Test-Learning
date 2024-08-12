package ir.alirahimi.testapp

import ir.alirahimi.testapp.data.local.User
import ir.alirahimi.testapp.data.repository.UserRepository
import ir.alirahimi.testapp.data.service.UserService
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.kotlin.whenever

class UserRepositoryTest {

    private lateinit var userService: UserService
    private lateinit var userRepository: UserRepository

    @Before
    fun setUp() {
        userService = mock(UserService::class.java)
        userRepository = UserRepository(userService)
    }

    @Test
    fun testGetUserById() {
        val expectedUser = User(1, "Ali", "ali@gmail.com")
        whenever(userService.getUserById(1)).thenReturn(expectedUser)
        val actualUser = userRepository.getUser(1)
        assertEquals(expectedUser, actualUser)
        verify(userService).getUserById(1)
    }

    @Test
    fun testGetUserByName() {
        val expectedUser = User(2, "Soroush", "soroush@gmail.com")
        whenever(userService.getUserName("Soroush")).thenReturn(expectedUser)
        val actualUser = userRepository.getUserByName("Soroush")
        assertEquals(expectedUser, actualUser)
        verify(userService).getUserName("Soroush")
    }

    @Test
    fun testGetUserByEmail() {
        val expectedUser = User(1, "Ali", "ali@gmail.com")
        whenever(userService.getUserByEmail("ali@gmail.com")).thenReturn(expectedUser)
        val actualUser = userRepository.getUserByEmail("ali@gmail.com")
        assertEquals(expectedUser, actualUser)
        verify(userService).getUserByEmail("ali@gmail.com")
    }

    @Test
    fun testGetAllUsers() {
        val expectedUsers = listOf(
            User(1, "Ali", "ali@gmail.com"),
            User(2, "Soroush", "soroush@gmail.com")
        )
        whenever(userService.getAllUsers()).thenReturn(expectedUsers)
        val actualUsers = userRepository.getAllUsers()
        assertEquals(expectedUsers, actualUsers)
        verify(userService).getAllUsers()
    }

    @Test
    fun testGetUserByInvalidId() {
        whenever(userService.getUserById(99)).thenReturn(null)
        val actualUser = userRepository.getUser(99)
        assertNull(actualUser)
        verify(userService).getUserById(99)
    }
}
