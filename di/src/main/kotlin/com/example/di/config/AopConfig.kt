package com.example.di.config

import org.aspectj.lang.JoinPoint
import org.slf4j.LoggerFactory
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

/**
 * このファイルはSpring AOPを実装する際の設定ファイルです
 * 公式サイト：https://docs.spring.io/spring-framework/reference/core/aop/ataspectj/example.html
 * ※Diconfigファイルで手動でDIコンテナに登録していた場合、処理がうまく行かなかった。。。
 * org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'autowiredUserService' defined in file [/Users/oohirasuguru/Documents/springBoot/di/build/classes/kotlin/main/com/example/di/sample/AutowiredUserService.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'userService' defined in class path resource [com/example/di/config/DiConfig.class]: Could not generate CGLIB subclass of class com.example.di.sample.UserServiceImpl: Common causes of this problem include using a final class or a non-visible class
 */

@Aspect
@Component
class AopConfig {

    private val logger = LoggerFactory.getLogger(AopConfig::class.java)

    @Before("execution(* com.example.di.sample.*.*(..))")
    fun logMethod(jp: JoinPoint) {
        logger.info("メソッドの処理開始: ${jp.signature}")
    }
}