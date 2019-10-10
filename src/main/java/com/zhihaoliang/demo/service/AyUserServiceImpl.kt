package com.zhihaoliang.demo.service

import com.zhihaoliang.demo.dao.base.dao.AyUserMapper
import com.zhihaoliang.demo.model.AyUser
import com.zhihaoliang.demo.repository.AyUserRepository
import org.springframework.data.domain.Page
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.data.domain.Pageable
import org.springframework.transaction.annotation.Transactional
import javax.annotation.Resource

/**
 *
 * @author zhihaoliang
 * @date 2019/9/302:01 PM
 * @version：1.0.0
 */
@Service
@Transactional
open class AyUserServiceImpl :AyUserService {

    @Resource
    lateinit var ayUserRepository: AyUserRepository

    @Resource
    lateinit var ayUserMapper: AyUserMapper

   override fun findById(id: String): AyUser? {
        return ayUserRepository.findByIdOrNull(id)
    }

    override fun findAll(): List<AyUser> {
        return ayUserMapper.selectAll()
    }

    override fun save(ayUser: AyUser): AyUser {
        return ayUserRepository.save(ayUser)
    }

    override fun delete(id: String) {
        ayUserRepository.deleteById(id)
    }

    override fun findAll(pageable: Pageable): Page<AyUser>{
        return ayUserRepository.findAll(pageable)
    }

}