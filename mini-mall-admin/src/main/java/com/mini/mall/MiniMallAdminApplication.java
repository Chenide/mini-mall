package com.mini.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MiniMallAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniMallAdminApplication.class, args);
    }

}
