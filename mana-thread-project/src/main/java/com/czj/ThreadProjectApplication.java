package com.czj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class ThreadProjectApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ThreadProjectApplication.class);
    }
}
