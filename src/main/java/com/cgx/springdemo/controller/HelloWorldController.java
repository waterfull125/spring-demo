package com.cgx.springdemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cgx.springdemo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class HelloWorldController {
    @Autowired
    HelloWorldService helleService;

    @RequestMapping(value = "/json/data",method = RequestMethod.POST,produces = "application/json;charset=utf-8;")
    @ResponseBody
    public String hello(@RequestBody String para){
        JSONObject json = JSON.parseObject(para);
        System.out.println(json.toString());
        String resultOfservice =helleService.hello();
        return json.toString()+resultOfservice;
    }
}
