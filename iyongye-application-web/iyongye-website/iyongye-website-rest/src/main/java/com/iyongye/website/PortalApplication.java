package com.iyongye.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序
 *
 * @author wangbencheng
 */
@ComponentScan({"com.iyongye"})
@MapperScan(basePackages = "com.iyongye.**.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PortalApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(PortalApplication.class, args);
    }
}
