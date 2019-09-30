package com.zhihaoliang.demo.service

import com.zhihaoliang.demo.model.AyUser
import com.zhihaoliang.demo.repository.AyUserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 *
 * @author zhihaoliang
 * @date 2019/9/302:01 PM
 * @version：1.0.0
 */
@Service
class AyUserServiceImpl :AyUserService {

    @Resource
    lateinit var ayUserRepository: AyUserRepository

   override fun findById(id: String): AyUser? {
        return ayUserRepository.findByIdOrNull(id)
    }

    override fun findAll(): List<AyUser> {
        return ayUserRepository.findAll()
    }

    override fun save(ayUser: AyUser): AyUser {
        return ayUserRepository.save(ayUser)
    }

    override fun delete(id: String) {
        ayUserRepository.deleteById(id)
    }
}