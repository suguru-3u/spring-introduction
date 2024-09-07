package com.example.di.sample

import com.example.di.`interface`.PasswordEncoder

class PasswordEncoderIml: PasswordEncoder {
    override fun encode(rawPassword: String) {
        println("Hello")
    }
}