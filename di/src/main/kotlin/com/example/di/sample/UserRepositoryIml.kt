package com.example.di.sample

import com.example.di.demein.UserRepository
import org.springframework.stereotype.Component

@Component
class UserRepositoryIml: UserRepository {
    override fun save(user: String) {
        println("Hello")
    }
}