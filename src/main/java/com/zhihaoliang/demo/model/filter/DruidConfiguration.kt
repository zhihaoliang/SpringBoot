package com.zhihaoliang.demo.model.filter

import com.alibaba.druid.support.http.StatViewServlet
import com.alibaba.druid.support.http.WebStatFilter
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 *
 * @author zhihaoliang
 * @date 2019/9/3011:46 AM
 * @version：1.0.0
 */

@Configuration
open class DruidConfiguration {

    @Bean
    open fun druidStatViewServle():ServletRegistrationBean<StatViewServlet>{
        val statViewServlet = ServletRegistrationBean(StatViewServlet(),"/druid/*")

        //添加初始化参数：initParams
        //白名单：
        statViewServlet.addInitParameter("allow","127.0.0.1")

        //IP 黑名单（存在共同时，deny 优先于 allow）

        //登录查看信息的账号和密码
        statViewServlet.addInitParameter("loginUsername","admin")
        statViewServlet.addInitParameter("loginPassword","123456")

        //是否能够重置数据
        statViewServlet.addInitParameter("resetEnable","false")

        return statViewServlet
    }

    @Bean
    open fun druidStatFilter():FilterRegistrationBean<WebStatFilter>{
        val  filterRegistrationBean = FilterRegistrationBean(WebStatFilter())

        //添加过滤器
        filterRegistrationBean.addUrlPatterns("/*")
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*")

        return filterRegistrationBean
    }
}