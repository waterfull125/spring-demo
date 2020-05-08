package com.cgx.springdemo.controller;



import com.alibaba.druid.sql.visitor.functions.Now;
import com.alibaba.fastjson.JSON;
import com.cgx.springdemo.entity.TAddress;
import com.cgx.springdemo.service.TAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.TabableView;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cgx
 * @since 2020-04-27
 */
@Controller
@RequestMapping("/address")
public class TAddressController {
    @Autowired
    private TAddressService tAddressService;

    @RequestMapping("/add")
    public void addressAdd(@RequestBody TAddress addressBody, HttpServletRequest request, HttpServletResponse response){
        System.out.println("request = " + addressBody.toString());
//        TAddress addr = new TAddress();
//        //addr.setChannelId(request.getParameterMap().);
//        addr.setChannelId(1);
//        addr.setAddressDetail("cgx 地址");
//        addr.setType("1");
        addressBody.setCreator("system");
        addressBody.setModifier("system");
        addressBody.setGmtModified(LocalDateTime.now());
        addressBody.setGmtCreated(LocalDateTime.now());
        System.out.println("request = " + addressBody.toString());
        tAddressService.save(addressBody);

        response.setStatus(200);
        //JSON responseJson = JSON.toJSON(response);

    }

}
