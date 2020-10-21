package com.dxf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/*
 *创建日期：2020/10/21/19:46
 *创建人：dxf
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("queryByUserName")
    public String queryByUserName(String username){
        System.out.println("进来了   1");

        String url = "http://EUREKA-CLIENT2/book/queryBook?username="+username;

        String forObject = restTemplate.getForObject(url, String.class);

        return forObject;
    }

}
