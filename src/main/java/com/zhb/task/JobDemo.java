package com.zhb.task;

import com.zhb.bean.TCustomers;
import com.zhb.service.CustomerCareService;
import com.zhb.service.MqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobDemo {

    @Autowired
    private CustomerCareService customerCareService;

    @Autowired
    private MqService mqService;

    public void insertCustomer(){
        List<TCustomers> list = mqService.getList();
        System.out.println(list.size());
        customerCareService.addCustomerToEs(list);
        System.out.println(list.size()+"!!!!success");
    }
}
