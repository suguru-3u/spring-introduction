package com.example.di.sample

import com.example.di.`interface`.UserRepository

class UserRepositoryIml: UserRepository {
    override fun countByUsername(username: String): Int {
        return 10
    }

    override fun save(user: String): String {
        return "Hello"
    }
}