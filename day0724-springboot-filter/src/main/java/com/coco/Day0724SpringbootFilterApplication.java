package com.coco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.coco.filter")
public class Day0724SpringbootFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day0724SpringbootFilterApplication.class, args);
    }

}
