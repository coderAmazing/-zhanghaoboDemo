package com.zhb.service;

import com.alibaba.fastjson.JSONObject;
import com.zhb.bean.customers.TCustomers;

import java.util.List;

public interface CustomerCareService {

    void addCustomerToEs(List<TCustomers> list);

    void addCustomerToMysql(List<TCustomers> list);

    List<JSONObject> queryCustomer(String param, String phone);
}
