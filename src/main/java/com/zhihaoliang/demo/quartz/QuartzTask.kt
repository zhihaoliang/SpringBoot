package com.zhihaoliang.demo.quartz


/**
 *
 * @author zhihaoliang
 * @date 2019/10/84:07 PM
 * @version：1.0.0
 */

class QuartzTask {
    val logger = org.apache.logging.log4j.LogManager.getLogger(this::class)
    fun execute() {
        logger.error("定时任务启动")
    }

}