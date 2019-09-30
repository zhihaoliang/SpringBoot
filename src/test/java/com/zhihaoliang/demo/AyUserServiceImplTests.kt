package com.zhihaoliang.demo

import com.zhihaoliang.demo.service.AyUserService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

/**
 *
 * @author zhihaoliang
 * @date 2019/9/302:14 PM
 * @version：1.0.0
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class AyUserServiceImplTests {
    @Resource
    lateinit var ayUserService: AyUserService

    @Test
    fun test() {
    }
}