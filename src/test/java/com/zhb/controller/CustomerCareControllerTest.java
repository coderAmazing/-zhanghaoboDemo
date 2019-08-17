package com.zhb.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhb.ApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerCareControllerTest extends ApplicationTest{
    @Autowired
    CustomerCareController customerCareController;
    @Test
    public void customersList() throws Exception {
        List<JSONObject> list = customerCareController.customersList("星飞", null);
        System.out.println(list.size());
        list = customerCareController.customersList(null, "18737890");
        System.out.println(list.size());
    }


}