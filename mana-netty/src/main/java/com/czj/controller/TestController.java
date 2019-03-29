package com.czj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jie
 * 测试类
 */
@RestController
@RequestMapping("test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * 测试方法
     */
    @RequestMapping(value = "/test.json", method = RequestMethod.GET)
    public String test() {
        return "你好！！";
    }
}
