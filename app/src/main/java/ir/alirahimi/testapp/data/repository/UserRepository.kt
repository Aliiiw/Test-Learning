package ir.alirahimi.testapp.data.repository

import ir.alirahimi.testapp.data.local.User
import ir.alirahimi.testapp.data.service.UserService

class UserRepository(private val userService: UserService) {

    fun getUser(userId: Int): User? {
        return userService.getUserById(userId)
    }

    fun getUserByName(name: String): User? {
        return userService.getUserName(name)
    }

    fun getUserByEmail(email: String): User? {
        return userService.getUserByEmail(email)
    }

    fun getAllUsers(): List<User> = userService.getAllUsers()

}





