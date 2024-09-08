package com.example.di.sample

import com.example.di.demein.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * このクラスでは、DIコンテナからのインジェクションにオートワイヤリングを使用しています。
 * (アノテーションだけでDIコンテナから取得できる方法）
 */

@Component // オートワイヤリングするのに必要
class AutowiredUserService(@Autowired val userService: UserService) {

    fun fieldDi() {
        userService.register("DI", "DI")
    }
}