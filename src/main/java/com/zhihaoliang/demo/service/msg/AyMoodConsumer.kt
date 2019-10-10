package com.zhihaoliang.demo.service.msg

import com.zhihaoliang.demo.model.AyMood
import com.zhihaoliang.demo.service.AyMoodService
import org.apache.logging.log4j.LogManager
import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component
import javax.annotation.Resource

/**
 *
 * @author zhihaoliang
 * @date 2019/10/101:50 PM
 * @version：1.0.0
 */
@Component
class AyMoodConsumer {

    val logger = LogManager.getLogger(this::class)

    @Resource
    lateinit var ayMoodService: AyMoodService

    @JmsListener(destination = "ay.queue")
    fun receiveQueue(msg:String){
        logger.error("用户发表说说${msg}成功")
    }

    @JmsListener(destination = "ay.queue.asyn.save")
    fun receiveQueue(ayMood: AyMood){
        ayMoodService.save(ayMood)
    }
}