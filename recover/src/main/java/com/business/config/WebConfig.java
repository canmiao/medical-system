package com.business.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * netty
 * @author 池灿淼
 * @date 2020/5/24
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index").setViewName("index");
        registry.addViewController("toLogin").setViewName("login");
        registry.addViewController("/websocket").setViewName("websocket");
    }
}
