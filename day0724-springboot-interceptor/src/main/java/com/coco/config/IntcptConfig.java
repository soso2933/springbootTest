package com.coco.config;

import com.coco.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cocoLin
 * @ 2021-07-24 14:56
 * 配置类
 */
@Configuration
public class IntcptConfig implements WebMvcConfigurer {
    String[] addPathPatterns={
            "/user/**"
    };

    String[] excludePathPatterns={
            "/user/out","/user/error","/user/login"
    };
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
