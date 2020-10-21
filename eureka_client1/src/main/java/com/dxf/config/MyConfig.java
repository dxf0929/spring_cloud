package com.dxf.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
 *创建日期：2020/10/21/19:48
 *创建人：dxf
 */
@Configuration
public class MyConfig {

    @LoadBalanced  //负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
