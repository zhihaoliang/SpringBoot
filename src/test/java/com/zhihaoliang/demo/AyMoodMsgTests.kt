package com.zhihaoliang.demo

import com.zhihaoliang.demo.model.AyMood
import com.zhihaoliang.demo.service.AyMoodService
import com.zhihaoliang.demo.service.msg.AyMoodProducer
import org.apache.activemq.command.ActiveMQQueue
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
class AyMoodMsgTests {

    @Resource
    lateinit var ayMoodProducer: AyMoodProducer

    @Resource
    lateinit var ayMoodService: AyMoodService

    @Test
    fun test() {
        ayMoodProducer.sendMessage("ay.queue", "MQ")
    }

    @Test
    fun setAyMood() {

        val ayMood = AyMood()
        ayMood.id = "4"
        ayMood.userId = "4"
        ayMood.praiseNum = 0
        ayMood.content = "这是我的第4条微信说说"
        ayMood.praiseNum = 0
        ayMood.publishTime = Date()
        ayMoodProducer.sendMessage("ay.queue.asyn.save", ayMood)

        ayMood.id = "2"
        ayMood.userId = "2"
        ayMood.praiseNum = 0
        ayMood.content = "这是我的第2条微信说说"
        ayMood.praiseNum = 0
        ayMood.publishTime = Date()

        ayMoodService.save(ayMood)
    }
}