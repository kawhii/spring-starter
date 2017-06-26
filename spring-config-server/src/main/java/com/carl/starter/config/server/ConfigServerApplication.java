package com.carl.starter.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Carl
 * @date 2017/6/26
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}