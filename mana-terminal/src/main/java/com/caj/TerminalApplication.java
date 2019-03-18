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
    private final int fileSingleSize = 1 * 1024 * 1024 * 1024;
    /**
     * 总文件大小
     */
    private final int fileTotalSize = 5 * 1024 * 1024 * 1024;

    /**
     * 文件上传大小配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 设置文件大小限制 ,超出设置页面会抛出异常信息，
        // 这样在文件上传的地方就需要进行异常信息的处理了;
        // 单个文件大小
        factory.setMaxFileSize(fileSingleSize + "MB");
        // 总上传数据总大小
        factory.setMaxRequestSize(fileTotalSize + "MB");
        // Sets the directory location where files will be stored.
        // factory.setLocation("路径地址");
        return factory.createMultipartConfig();
    }
}
