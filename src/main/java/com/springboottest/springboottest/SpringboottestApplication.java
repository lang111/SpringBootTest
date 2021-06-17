package com.springboottest.springboottest;

import com.springboottest.springboottest.Bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = "com.springboottest.springboottest.mapper")
@SpringBootApplication(scanBasePackages = "com.springboottest")
public class SpringboottestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringboottestApplication.class, args);
        User bean = run.getBean(User.class);
        System.out.println(bean);
    }

}
