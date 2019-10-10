package com.zhihaoliang.demo.service.msg

import org.springframework.jms.core.JmsMessagingTemplate
import org.springframework.stereotype.Service
import javax.annotation.Resource
import javax.jms.Destination

/**
 *
 * @author zhihaoliang
 * @date 2019/10/101:49 PM
 * @version：1.0.0
 */
@Service
class AyMoodProducer {
    @Resource
    lateinit var jmsMessagingTemplate: JmsMessagingTemplate

    fun sendMessage(destination: Destination,msg:String){
        jmsMessagingTemplate.convertAndSend(msg,destination)
    }

}