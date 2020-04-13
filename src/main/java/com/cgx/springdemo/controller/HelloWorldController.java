package com.cgx.springdemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class HelloWorldController {
    @RequestMapping(value = "/json/data",method = RequestMethod.POST,produces = "application/json;charset=utf-8;")
    @ResponseBody
    public String hello(@RequestBody String para){
        JSONObject json = JSON.parseObject(para);
        System.out.println(json.toString());
        return json.toString();
    }
}
