package com.example.jwtdemo.config;

import com.example.jwtdemo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Resource
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置接口只有携带token才可以访问的路劲,可变参数，可以传多个路径
        registry.addInterceptor(myInterceptor).addPathPatterns("/token/**","/helloworld");
    }
}

