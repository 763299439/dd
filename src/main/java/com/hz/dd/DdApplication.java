package com.hz.dd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdApplication.class, args);
    }

}
