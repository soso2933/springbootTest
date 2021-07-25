package com.coco.config;

import com.coco.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

/**
 * @author cocoLin
 * @create 2021-07-24 15:57
 */
@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean<Servlet> registrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return  registrationBean;

    }
}
