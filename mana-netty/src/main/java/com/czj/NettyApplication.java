package com.czj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients  //feign用于调用不同的服务
@EnableScheduling
public class NettyApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(NettyApplication.class);
    }
}
