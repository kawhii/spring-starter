package com.carl.starter.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * @author Carl
 * @date 2017/7/7
 * @since JDK1.7
 * 版权所有.(c)2008-2017.广州市森锐科技股份有限公司
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void get() throws Exception {
        redisTemplate.opsForValue().set("aaa", "abc");
        Object object = redisTemplate.opsForValue().get("aaa");
        Assert.isTrue("abc".equals(object != null ? object.toString() : null));
    }
}
