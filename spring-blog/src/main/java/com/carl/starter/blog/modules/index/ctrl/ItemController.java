package com.carl.starter.blog.modules.index.ctrl;

import com.carl.starter.blog.modules.index.ctrl.BlogClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Carl
 * @date 2017/6/29
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */
@RestController
public class ItemController {
    @Autowired
    private BlogClient client;

    @RequestMapping("/item")
    public String item() {

        return "test调用结果[" + client.home() + "]";
    }

    @RequestMapping("/json")
    public Map json() {
        Map<String, String> res = new HashMap();
        res.put("res", "test res");
        return res;
    }
}
