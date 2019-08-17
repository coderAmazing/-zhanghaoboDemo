package com.zhb.task.threaddemo;

import com.alibaba.fastjson.JSONObject;
import com.zhb.bean.customers.TCustomers;
import com.zhb.service.CustomerCareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = "prototype")
public class ThreadDemo implements Runnable{

    private TCustomers customers;
    private List<JSONObject> buffer;

    private CustomerCareService careService;

    public ThreadDemo(TCustomers customers,CustomerCareService careService,List<JSONObject> buffer) {
        this.customers = customers;
        this.careService=careService;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            if(this.customers.getName().contains("2")){
                System.out.println(this.customers.getName());
            }else {
                System.out.println(this.customers.getName() + "****");
                List<TCustomers> list = new ArrayList<>();
                list.add(customers);
//                careService.addCustomerToEs(list);
                careService.addCustomerToMysql(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
