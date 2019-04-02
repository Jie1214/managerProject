package com.czj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jie on 2019/4/1.
 *
 * @AUTHOR JIE
 * @date 2019/4/1
 */
@RestController
@RequestMapping("test")
public class TestController {
    /**
     * 测试方法
     */
    @RequestMapping(value = "/test.json", method = RequestMethod.GET)
    public String test(){
        return "en...";
    }
}
