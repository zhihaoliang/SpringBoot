package com.zhihaoliang.demo.service.msg

import com.zhihaoliang.demo.model.AyMood
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

    fun sendMessage(destination: String,msg:String){
        jmsMessagingTemplate.convertAndSend(destination,msg)
    }

    fun sendMessage(destination: String,ayMood:AyMood){
        jmsMessagingTemplate.convertAndSend(destination,ayMood)
    }


}