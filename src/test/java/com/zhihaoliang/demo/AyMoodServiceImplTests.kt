package com.zhihaoliang.demo

import com.zhihaoliang.demo.model.AyMood
import com.zhihaoliang.demo.service.AyMoodService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.*
import javax.annotation.Resource

/**
 *
 * @author zhihaoliang
 * @date 2019/10/1011:28 AM
 * @version：1.0.0
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class AyMoodServiceImplTests {
    @Resource
    lateinit var ayMoodService: AyMoodService

    @Test
    fun test() {
        val ayMood = AyMood()
        ayMood.id = "3"
        ayMood.userId = "3"
        ayMood.praiseNum = 0
        ayMood.content = "这是我的第一条微信说说"
        ayMood.praiseNum = 1
        ayMood.publishTime = Date()

        val index = ayMoodService.save(ayMood)
        println(index)
       // assert(index == 0)


       println( ayMoodService.read())

    }
}