package com.carl.starter.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author Carl
 * @date 2017/6/27
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
