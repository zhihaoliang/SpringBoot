package com.zhihaoliang.demo.service

import com.zhihaoliang.demo.model.AyUser

/**
 *
 * @author zhihaoliang
 * @date 2019/9/301:57 PM
 * @version：1.0.0
 */
interface AyUserService {
    fun findById(id:String):AyUser?

    fun findAll():List<AyUser>

    fun save(ayUser: AyUser): AyUser

    fun delete(id: String)
}