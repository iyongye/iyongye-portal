package com.iyongye.website.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 本项目由www.iyongye.com所有，侵权必究
 *
 * @author wangbencheng
 * @version 1.0
 * @className WebConfig
 * @since 2021/11/15 00:45
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 静态资源映射 css js image等
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //本应用
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/templates/assets/");
    }
}
