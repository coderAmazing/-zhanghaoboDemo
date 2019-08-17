package com.zhb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * Created by developer on 19-2-18.
 */

@SpringBootApplication
@ComponentScan({"com.zhb"})
@EnableScheduling
@MapperScan("com.zhb.dao.mysql")
public class Application {
    public static void main(String[] args) {
        System.setProperty("user.timezone", "UTC+08");
        SpringApplication.run(Application.class, args);
    }
}
