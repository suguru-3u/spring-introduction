package com.example.di.config

import com.example.di.demein.PasswordEncoder
import com.example.di.demein.UserRepository
import com.example.di.demein.UserService
import com.example.di.sample.PasswordEncoderIml
import com.example.di.sample.UserRepositoryIml
import com.example.di.sample.UserServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

/**
 * このファイルはSpringでDI設定を行うためのJava Configのクラスです
 * DI設定はXMLを使用した方法,アノテーションのみで管理するアノテーションベースと
 * 両方を組み合わせた方法がある
 */

@Configuration
@ComponentScan("com.example.di") // アノテーションベースと併用利用するために必要
@EnableAspectJAutoProxy // インターフェースベースのプロキシを使用
class DiConfig {

//    @Bean
//    fun passwordEncoder(): PasswordEncoder {
//        return PasswordEncoderIml()
//    }
//
//    @Bean
//    fun userRepository(): UserRepository {
//        return UserRepositoryIml()
//    }
//
//    @Bean
//    fun userService(): UserService {
//        return UserServiceImpl(userRepository(), passwordEncoder())
//    }
}