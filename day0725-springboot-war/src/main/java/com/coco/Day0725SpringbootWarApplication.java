package com.coco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Day0725SpringbootWarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Day0725SpringbootWarApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //当前springboot启动类；
        return builder.sources(Day0725SpringbootWarApplication.class);
    }
}
