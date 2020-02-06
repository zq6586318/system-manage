package com.sgcc.eip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan({"com.sgcc.eip.systemManage.mapper", "com.sgcc.eip.gatewayManage.mapper"})
@EnableEurekaClient
public class SystemManageApplication{

    public static void main(String[] args) {
        SpringApplication.run(SystemManageApplication.class, args);
    }
}
