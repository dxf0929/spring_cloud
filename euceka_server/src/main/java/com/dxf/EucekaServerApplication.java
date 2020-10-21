package com.dxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EucekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EucekaServerApplication.class, args);
    }

}
