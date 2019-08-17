package com.zhb.service.impl;

import com.zhb.bean.TCustomers;
import com.zhb.dao.MqDao;
import com.zhb.service.MqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MqServiceImpl implements MqService {
    @Autowired
    MqDao mqDao;
    @Override
    public List<TCustomers> getList() {
        List<TCustomers> customers = MqDao.getCustomers();
        return customers;
    }
}
