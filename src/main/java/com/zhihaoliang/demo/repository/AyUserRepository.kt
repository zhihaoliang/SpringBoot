package com.zhihaoliang.demo.repository

import com.zhihaoliang.demo.model.AyUser
import org.springframework.data.jpa.repository.JpaRepository

/**
 *
 * @author zhihaoliang
 * @date 2019/9/302:06 PM
 * @version：1.0.0
 */

interface AyUserRepository : JpaRepository<AyUser, String>