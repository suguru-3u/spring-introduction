package com.example.di.sample

import com.example.di.demein.PasswordEncoder
import com.example.di.demein.UserRepository
import com.example.di.demein.UserService
import org.springframework.stereotype.Component

/**
 * このファイルはSpringのDIについて学習した内容のアウトプット用のファイルです。
 * ※Spring徹底入門
 * DIコンテナのインジェクション(DIコンテナからのクラス取得)はコンストラクタで
 * 行っているが、他にもセッター、フィールドでも行うことができる。
 * ただし、コンストラクタが一般であり安全と言われている
 */

@Component
class UserServiceImpl(
    val userRepository: UserRepository, val passwordEncoder: PasswordEncoder
) : UserService {
    override fun register(user:String,rawPassword:String){
        println("Hello Java Config register function")
    }
}