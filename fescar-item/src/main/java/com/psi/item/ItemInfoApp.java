package com.psi.item;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.psi.api.feign"})
@MapperScan(basePackages = {"com.psi.item.dao"})
public class ItemInfoApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemInfoApp.class, args);
        System.out.println("ItemInfo服务启动");
    }
}
