package com.carl.starter.blog.modules.index.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carl
 * @date 2017/6/30
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */
@RestController
public class IndexController {
    @Value("${blog_name:carl!}")
    private String name;

    @RequestMapping("/")
    public String home() {
        return "Hello World," + name;
    }
}
