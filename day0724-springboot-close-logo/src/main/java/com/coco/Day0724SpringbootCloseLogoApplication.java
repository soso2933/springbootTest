package com.coco;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day0724SpringbootCloseLogoApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(Day0724SpringbootCloseLogoApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

}
