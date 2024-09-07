package com.example.di.`interface`

interface UserRepository {
    fun save(user:String):String
    fun countByUsername(username:String):Int
}