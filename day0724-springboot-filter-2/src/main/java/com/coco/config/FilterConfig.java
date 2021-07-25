package com.coco.config;

import com.coco.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author cocoLin
 * @create 2021-07-24 16:33
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new MyFilter());
        registrationBean.addUrlPatterns("/my");
        return registrationBean;
    }
}
