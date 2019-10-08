package com.zhihaoliang.demo

import com.zhihaoliang.demo.model.AyUser
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet
import java.sql.SQLException
import javax.annotation.Resource


/**
 *
 * @author zhihaoliang
 * @date 2019/9/303:24 PM
 * @version：1.0.0
 */

@RunWith(SpringRunner::class)
@SpringBootTest
class DemoApplicationTests {
    @Resource
    lateinit var jdbcTemplate: JdbcTemplate

    @Resource
    lateinit var redisTemplate: RedisTemplate<String, Any>

    @Resource
    lateinit var stringRedisTemplate: StringRedisTemplate

    @Test
    fun mySqlTest() {
        val sql = "SELECT id,name,password FROM ay_user"
        val userList = jdbcTemplate.query(sql) { resultSet, i ->
            val ayUser = AyUser()
            ayUser.id = resultSet.getString("id")
            ayUser.name = resultSet.getString("name")
            ayUser.password = resultSet.getString("password")
            ayUser
        }
        println(userList)

    }

    @Test
    fun testRedis(){
        redisTemplate.opsForValue().set("hello","world")

        val  world = redisTemplate.opsForValue().get("hello") as String
        assert("world".equals(world))

        redisTemplate.delete("hello")

        redisTemplate.opsForValue().set("hello1","hello")
        val hellotmp =stringRedisTemplate.opsForValue().get("hello1")
        println(hellotmp)
        assert(hellotmp == null)

        stringRedisTemplate.opsForValue().set("hello2","hello")
        val hello =stringRedisTemplate.opsForValue().get("hello2")
        println(hello)
        assert("hello".equals(hello))
    }
}