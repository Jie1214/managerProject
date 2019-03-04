package com.caj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.MultipartConfigElement;

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

    /**
     * 单个文件大小
     */
    private final int fileSingleSize = 1024;
    /**
     * 总文件大小
     */
    private final int fileTotalSize = 5120;

    /**
     * 文件上传大小配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 单个文件大小
        factory.setMaxFileSize(fileSingleSize + "MB");
        // 总上传数据总大小
        factory.setMaxRequestSize(fileTotalSize + "MB");
        return factory.createMultipartConfig();
    }
}
