package com.coco;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Day0722SpringbootDubboSsmConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day0722SpringbootDubboSsmConsumerApplication.class, args);
    }

}
