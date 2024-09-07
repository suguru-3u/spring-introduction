package com.example.di

import com.example.di.config.AppConfig
import com.example.di.`interface`.UserService
import com.example.di.sample.AutowiredUserService
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootApplication
class DiApplication

fun main(args: Array<String>) {
	runApplication<DiApplication>(*args)
	println("")
	println("--------------------")
	// Java ConfigのDIコンテナからクラスを取得する方法
	// 参考情報：https://spring.pleiades.io/spring-framework/reference/core/beans/java/instantiating-container.html
	val context = AnnotationConfigApplicationContext(AppConfig::class.java)
	val userService = context.getBean<UserService>()
	userService.register("DI","DI")

	val userService2 = context.getBean<AutowiredUserService>()
	userService2.fieldDi()

	println("--------------------")
	println("")
}
