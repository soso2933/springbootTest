package com.coco.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

/**
 * @author cocoLin
 * @create 2021-07-24 16:46
 */
//@Configuration
public class SystemConfig {
    @Bean
    public FilterRegistrationBean characterEncoding(){
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setForceEncoding(true);
        encodingFilter.setEncoding("utf-8");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(encodingFilter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
