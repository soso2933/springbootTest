package com.coco;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.coco.dao")
public class Day0719SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day0719SpringbootMybatisApplication.class, args);
    }

}
