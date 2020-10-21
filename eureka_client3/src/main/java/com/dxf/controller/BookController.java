package com.dxf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/*
 *创建日期：2020/10/21/19:57
 *创建人：dxf
 */
@RestController
@RequestMapping("book")
public class BookController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("queryBook")
    public String queryBook(String username){

        System.out.println(username);

        System.out.println("这是图书模块");

        return "  2 访问到了图书信息";
    }
}

