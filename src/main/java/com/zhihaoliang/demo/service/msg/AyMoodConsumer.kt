package com.zhihaoliang.demo.service.msg

import org.apache.logging.log4j.LogManager
import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component

/**
 *
 * @author zhihaoliang
 * @date 2019/10/101:50 PM
 * @version：1.0.0
 */
@Component
class AyMoodConsumer {

    val logger = LogManager.getLogger(this::class)

    @JmsListener(destination = "ay.queue")
    fun receiveQueue(msg:String){
        logger.error("用户发表说说${msg}成功")
    }
}