package com.carl.starter.blog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carl
 * @date 2017/6/26
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients
@RestController
public class BlogApplication {
    @Value("${blog_name:carl!}")
    private String name;

    @RequestMapping("/")
    public String home() {
        return "Hello World," + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
