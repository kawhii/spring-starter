package com.carl.starter.api.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.MailSender;

/**
 * 邮箱发送程序
 * @author Carl
 * @date 2017/7/3
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */
@SpringBootApplication
public class MailApplication {
    @Autowired
    private MailSender mailSender;

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }
}
