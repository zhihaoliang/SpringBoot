package com.zhihaoliang.demo.filter

import javax.servlet.*
import javax.servlet.annotation.WebFilter

/**
 *
 * @author zhihaoliang
 * @date 2019/9/306:03 PM
 * @version：1.0.0
 */
@WebFilter(filterName = "ayUserFilter" ,urlPatterns = arrayOf("/*"))
class AyUserFilter : Filter {

    override fun init(filterConfig: FilterConfig?) {
        println("------> init")
    }

    override fun doFilter(p0: ServletRequest?, p1: ServletResponse?, p2: FilterChain?) {
        println("------> doFilter")
    }

    override fun destroy() {
        println("------> destroy")
    }
}