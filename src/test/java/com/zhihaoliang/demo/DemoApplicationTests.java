package com.zhihaoliang.demo;

import com.zhihaoliang.demo.model.AyUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void mySqlTest(){
        String sql  = "SELECT id,name,password FROM ay_user";
        List<AyUser> userList = jdbcTemplate.query(sql, (resultSet, i) -> {
            return new AyUser(resultSet.getString("id"),
                    resultSet.getString("name"),resultSet.getString("password"));
        });

        System.out.println(userList);
    }

    @Test
    public void contextLoads() {
    }

}
