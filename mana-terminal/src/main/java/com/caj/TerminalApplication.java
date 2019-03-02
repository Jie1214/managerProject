package com.caj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author jie
 * @date 2019-01-05
 * 自己制作的管理系统的 web 端
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients  //feign用于调用不同的服务
@EnableScheduling
public class TerminalApplication {
    public static void main( String[] args ) {
        SpringApplication.run(TerminalApplication.class);
    }
}
