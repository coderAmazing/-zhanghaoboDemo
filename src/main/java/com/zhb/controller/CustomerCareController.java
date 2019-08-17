package com.zhb.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhb.bean.customers.TCustomers;
import com.zhb.service.CustomerCareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerCareController {

    @Autowired
    private CustomerCareService careService;
    @RequestMapping("/abc")
    public List<JSONObject> customersList(@RequestParam String param, @RequestParam String phone){
       return  careService.queryCustomer(param, phone);
    }


}
