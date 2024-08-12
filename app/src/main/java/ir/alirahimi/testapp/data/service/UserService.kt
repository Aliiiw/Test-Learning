package ir.alirahimi.testapp.data.service

import ir.alirahimi.testapp.data.local.User

class UserService {

    private val users = listOf(
        User(1, "Ali Rahimi", "alirahimi@gmail.com"),
        User(2, "Soroush Javanmard", "soroushjavanmard@gmail.com")
    )

    fun getUserById(userId: Int): User? {
        return users.find { it.id == userId }
    }

    fun getUserName(name: String): User? {
        return users.find { it.name == name }
    }

    fun getUserByEmail(email: String): User? {
        return users.find { it.email == email }
    }

    fun getAllUsers() = users

}

