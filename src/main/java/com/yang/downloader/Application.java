package com.yang.downloader;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangl
 * @Description springboot启动类
 * @date 2017/8/25.
 */
// MyBatis 支持
@MapperScan("com.yang.downloader.dao")
@SpringBootApplication
public class Application{
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}