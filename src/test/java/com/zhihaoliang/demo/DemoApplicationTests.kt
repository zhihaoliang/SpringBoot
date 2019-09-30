package com.zhihaoliang.demo

import com.zhihaoliang.demo.model.AyUser
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
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

    @Test
    fun mySqlTest(){
        val sql  = "SELECT id,name,password FROM ay_user"
        val userList = jdbcTemplate.query(sql) { resultSet, i ->
            val ayUser = AyUser()
            ayUser.id = resultSet.getString("id")
            ayUser.name = resultSet.getString("name")
            ayUser.password = resultSet.getString("password")
            ayUser
        }
        println(userList)

    }
}