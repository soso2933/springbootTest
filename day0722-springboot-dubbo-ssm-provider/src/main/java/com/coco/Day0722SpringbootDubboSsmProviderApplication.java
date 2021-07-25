package com.coco;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.coco.dao")
@EnableDubboConfiguration
public class Day0722SpringbootDubboSsmProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day0722SpringbootDubboSsmProviderApplication.class, args);
    }

}
