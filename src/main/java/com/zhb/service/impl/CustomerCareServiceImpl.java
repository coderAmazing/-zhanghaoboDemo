package com.zhb.service.impl;

import com.zhb.bean.customers.TCustomers;
import com.zhb.dao.mysql.TCustomersMapper;
import com.zhb.dao.esdao.BaseEsDao;
import com.zhb.service.CustomerCareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerCareServiceImpl implements CustomerCareService {

    @Autowired
    private BaseEsDao baseEsDao;

    @Autowired
    TCustomersMapper mapper;


    @Value("${es.index.customer}")
    private String index;

    @Value("${es.type.customer}")
    private String esType;



    @Override
    public void addCustomerToEs(List<TCustomers> list) {
        baseEsDao.addRecord(list,index,esType,true,true);
    }

    @Override
    public void addCustomerToMysql(List<TCustomers> list) {
        for (int i = 0; i < list.size(); i++) {
            mapper.insert(list.get(i));
        }
    }
}
