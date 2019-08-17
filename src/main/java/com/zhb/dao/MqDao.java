package com.zhb.dao;

import com.zhb.bean.TCustomers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class MqDao {
    public static List<TCustomers> getCustomers(){
        List<TCustomers> result = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            TCustomers customers = new TCustomers(i,"name"+i,"wechat"+i,new Date(),"1873789"+i,"0",50,"母乳","是","星飞帆"+i,"hahahahah"+i,"123321"+i,
                    "星不凡","1",111,"0",
                    "潜在客户",new Date(),new Date(),"0",123+i);
            result.add(customers);
        }
        return result;
    }
}
