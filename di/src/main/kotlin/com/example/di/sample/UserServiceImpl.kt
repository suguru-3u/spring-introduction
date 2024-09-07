package com.example.di.sample

import com.example.di.`interface`.PasswordEncoder
import com.example.di.`interface`.UserRepository
import com.example.di.`interface`.UserService
import org.springframework.stereotype.Component

/**
 * このファイルはSpringのDIについて学習した内容のアウトプット用のファイルです。
 * ※Spring徹底入門
 * DIコンテナのインジェクション(DIコンテナからのクラス取得)はコンストラクタで
 * 行っているが、他にもセッター、フィールドでも行うことができる。
 * ただし、コンストラクタが一般であり安全と言われている
 */


class UserServiceImpl(
    val userRepository: UserRepository, val passwordEncoder: PasswordEncoder
) : UserService {
    override fun register(user:String,rawPassword:String){
        println("Hello Java Config register function")
    }
}