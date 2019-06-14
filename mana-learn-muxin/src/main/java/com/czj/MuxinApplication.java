package com.czj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = {"com.czj"})

@SpringBootApplication
// 扫描mybatis mapper包路径
//@MapperScan(basePackages="com.czj.dao")
// 扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
//@ComponentScan(basePackages= {"com.czj", "org.n3r.idworker"})
@ComponentScan(basePackages= {"com.czj"})
public class MuxinApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MuxinApplication.class);
    }
}
