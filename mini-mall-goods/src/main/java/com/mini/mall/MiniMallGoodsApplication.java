package com.mini.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MiniMallGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniMallGoodsApplication.class, args);
    }

}
