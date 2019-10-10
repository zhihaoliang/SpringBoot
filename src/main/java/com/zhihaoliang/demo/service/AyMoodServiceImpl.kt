package com.zhihaoliang.demo.service

import com.zhihaoliang.demo.dao.base.dao.AyMoodMapper
import com.zhihaoliang.demo.model.AyMood
import com.zhihaoliang.demo.service.msg.AyMoodProducer
import org.apache.activemq.command.ActiveMQQueue
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.annotation.Resource

/**
 *
 * @author zhihaoliang
 * @date 2019/10/1011:20 AM
 * @version：1.0.0
 */
@Service
@Transactional
open class AyMoodServiceImpl : AyMoodService {

    @Resource
    lateinit var ayMoodProducer: AyMoodProducer

    @Resource
    lateinit var ayMoodMapper: AyMoodMapper

    override fun save(ayMood: AyMood): Int {
        return ayMoodMapper.insert(ayMood)
    }

    override fun read(): List<AyMood> {
        return ayMoodMapper.selectAll()
    }

    override fun asynSave(ayMood: AyMood): String {
        ayMoodProducer.sendMessage("ay.queue.asyn.save", ayMood)
        return "success"
    }
}