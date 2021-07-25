package com.coco;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.coco.dao")
public class Day0721SpingbootSpringmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day0721SpingbootSpringmvcApplication.class, args);
    }

}
