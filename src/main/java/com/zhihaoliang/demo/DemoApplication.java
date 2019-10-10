package com.zhihaoliang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan( "com.zhihaoliang.demo.dao.base.dao")
@SpringBootApplication
@ServletComponentScan
@ImportResource(locations = ("classpath:spring-mvc.xml"))
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
