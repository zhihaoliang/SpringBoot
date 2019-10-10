package com.zhihaoliang.demo

import com.zhihaoliang.demo.service.msg.AyMoodProducer
import org.apache.activemq.command.ActiveMQQueue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
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

    @Test
    fun test() {
       val  destination = ActiveMQQueue("ay.queue")
        ayMoodProducer.sendMessage(destination,"MQ")
    }
}