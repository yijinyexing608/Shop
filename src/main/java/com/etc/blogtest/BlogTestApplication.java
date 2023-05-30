package com.etc.blogtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.etc.blogTest.dao")

public class BlogTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogTestApplication.class, args);
    }

}
