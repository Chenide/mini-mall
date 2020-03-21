package com.mini.mall.springcloudserveradministrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServerAdministratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerAdministratorApplication.class, args);
    }

}
