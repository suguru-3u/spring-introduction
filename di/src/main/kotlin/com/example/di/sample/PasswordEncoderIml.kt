package com.example.di.sample

import com.example.di.demein.PasswordEncoder
import org.springframework.stereotype.Component

@Component
class PasswordEncoderIml: PasswordEncoder {
    override fun encode(rawPassword: String) {
        println("Hello")
    }
}