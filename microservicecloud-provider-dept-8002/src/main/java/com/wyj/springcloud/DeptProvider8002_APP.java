package com.wyj.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
@EnableEurekaClient
@Configuration
@MapperScan("com.wyj.springcloud.dao")
@SpringBootApplication
public class DeptProvider8002_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_APP.class,args);
    }
}
