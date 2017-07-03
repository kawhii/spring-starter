package com.carl.starter.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Carl
 * @date 2017/6/26
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */

@EnableEurekaClient
@EnableFeignClients
@EnableZuulProxy
@SpringBootApplication
public class BlogApplication {
    //append test
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }
}
