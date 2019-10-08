package com.zhihaoliang.demo.listener

import com.zhihaoliang.demo.model.AyUser
import com.zhihaoliang.demo.service.AyUserService
import org.apache.logging.log4j.LogManager
import org.springframework.data.redis.core.RedisTemplate
import javax.annotation.Resource
import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener
import javax.servlet.annotation.WebListener

/**
 *
 * @author zhihaoliang
 * @date 2019/9/306:45 PM
 * @version：1.0.0
 */

const val ALL_USER ="all_user"

@WebListener
class AyUserListener : ServletContextListener {



    val logger = LogManager.getLogger(this::class)

    @Resource
    lateinit var ayUserService: AyUserService


    @Resource
    lateinit var redisTemplate: RedisTemplate<String,List<AyUser>>

    override fun contextInitialized(sce: ServletContextEvent?) {
        super.contextInitialized(sce)

        val listUsers = ayUserService.findAll()

        println(listUsers)
        redisTemplate.delete(ALL_USER)
        redisTemplate.opsForList().leftPushAll(ALL_USER,listUsers)

        val  listUserRedis = redisTemplate.opsForList().leftPop(ALL_USER)

        logger.error("缓存中的当前人数为 ${listUserRedis.size}")
    }

    override fun contextDestroyed(sce: ServletContextEvent?) {
        println("------------> contextDestroyed")
        super.contextDestroyed(sce)
    }
}