package com.zhihaoliang.demo.controller

import com.zhihaoliang.demo.service.AyUserService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import javax.annotation.Resource

/**
 *
 * @author zhihaoliang
 * @date 2019/9/304:39 PM
 * @version：1.0.0
 */
@Controller
@RequestMapping("ayUser")
class AyUserController {

    @Resource
    lateinit var ayUserService: AyUserService

    @RequestMapping("/test")
    fun test(model:Model):String{
        val  list = ayUserService.findAll()
        model.addAttribute("users",list)
        return "ayUser"
    }
}