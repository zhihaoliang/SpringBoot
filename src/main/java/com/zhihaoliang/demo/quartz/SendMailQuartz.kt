package com.zhihaoliang.demo.quartz

import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Configurable
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

/**
 *
 * @author zhihaoliang
 * @date 2019/10/85:50 PM
 * @version：1.0.0
 */
@Component
@Configurable
@EnableScheduling
class SendMailQuartz {
    val logger = LogManager.getLogger(this::class)

    @Scheduled(cron = "0/10 * * * * ?")
    fun execute(){
        logger.error("注释的定时器开始运行")
    }
}