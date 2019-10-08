package com.zhihaoliang.demo.listener

import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener
import javax.servlet.annotation.WebListener

/**
 *
 * @author zhihaoliang
 * @date 2019/9/306:45 PM
 * @version：1.0.0
 */
@WebListener
class AyUserListener :ServletContextListener{

    override fun contextInitialized(sce: ServletContextEvent?) {
        super.contextInitialized(sce)
        println("------------> contextInitialized")
    }

    override fun contextDestroyed(sce: ServletContextEvent?) {
        println("------------> contextDestroyed")
        super.contextDestroyed(sce)
    }
}