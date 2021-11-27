package com.psi.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.psi.api.feign"})
@MapperScan(basePackages = {"com.psi.user.dao"})
public class UserInfoApp {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoApp.class, args);
        System.out.println("User服务启动");
    }
}
