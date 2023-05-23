package com.ocean.mall.tiny;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.ocean.mall.tiny.dao"})
public class MallTinyLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallTinyLearningApplication.class, args);
    }

}
