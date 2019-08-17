package com.zhb.task;


import com.alibaba.fastjson.JSONObject;
import com.zhb.bean.customers.TCustomers;
import com.zhb.service.CustomerCareService;
import com.zhb.service.MqService;
import com.zhb.task.threaddemo.ThreadDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Component
public class JobDemo {

    ExecutorService fixedThreadPool = newFixedThreadPool(3);

    ExecutorService writeEs = newFixedThreadPool(1);
    public static List<JSONObject> buffer = new ArrayList<JSONObject>(1000);

    @Autowired
    private CustomerCareService customerCareService;

    @Autowired
    private MqService mqService;


    public void insertCustomer(){
        List<TCustomers> list = mqService.getList();
        System.out.println(list.size());
        customerCareService.addCustomerToEs(list);
        customerCareService.addCustomerToMysql(list);
        System.out.println(list.size()+"!!!!success");
    }

    public void insertCustomerByThread(){
        List<TCustomers> list = mqService.getList();
        for (TCustomers tCustomers : list) {
            fixedThreadPool.submit(new ThreadDemo(tCustomers,customerCareService,buffer));
        }

    }


//   {
//        1->;
//        pool:10;
//        thread: (计算 ---true > json ->esList);
//        thread: (计算 ---false);
//    }

    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }




}
