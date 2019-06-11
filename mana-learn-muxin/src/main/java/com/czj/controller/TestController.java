package com.czj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jie on 2019/6/11.
 *
 * @AUTHOR JIE
 * @date 2019/6/11
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping(value = "/test.json", method = RequestMethod.GET)
    public String text(){return "你好";}
}
