package com.carl.starter.blog.modules.index.ctrl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Carl
 * @date 2017/6/29 2017/6/29
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */
@FeignClient(name = "blog")
public interface BlogClient {
    //获取服务为blog的应用名字的/的mapping调用
    @RequestMapping("/index/")
    String home();
}
