package com.czj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jie
 * 测试类
 */
@Api(value = "测试接口", tags = "测试")
@RestController
@RequestMapping("test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * 测试方法
     */
    @ApiOperation(value = "test", notes = "test")
    @RequestMapping(value = "/test.json", method = RequestMethod.GET)
    public String test() {
        return "你好，我叫曹正洁,ok!!";
    }


    public static void main(String[] args) {
        System.out.print(2 << 4);
    }

    /**
     * 十进制转二进制
     * @param n
     */
    public static void binaryToDecimal(int n) {
        for (int i = 31; i >= 0; i--){
            System.out.print(n >>> i & 1);
        }
    }


}
