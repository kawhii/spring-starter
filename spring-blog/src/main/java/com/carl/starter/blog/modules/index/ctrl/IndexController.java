package com.carl.starter.blog.modules.index.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Carl
 * @date 2017/6/30
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */
@Controller
@RefreshScope
@RequestMapping("/index")
public class IndexController {
    @Value("${blog_name:carl!}")
    private String name;

    @GetMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
