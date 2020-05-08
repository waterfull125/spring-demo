package com.cgx.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    public String hello(){
        return  "hello service";
    }
}
