package com.iyongye.website.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 本项目由www.iyongye.com所有，侵权必究
 *
 * 错误页面跳转配置类
 * @author wangbencheng
 * @version 1.0
 * @className ErrorPageConfig
 * @since 2021/11/20 23:10
 */
@Configuration
public class ErrorPageConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage[] errorPages = new ErrorPage[1];
        errorPages[0] = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
        registry.addErrorPages(errorPages);
    }
}
