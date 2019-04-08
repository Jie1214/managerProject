package com.czj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author jie
 * @date 2019-01-05
 * 自己制作的管理系统的 web 端
 */
@SpringBootApplication
@EnableScheduling
public class ProdobufApplication {

    public static void main( String[] args ) {
        SpringApplication.run(ProdobufApplication.class);
    }
}
