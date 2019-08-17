package com.zhb.task;

import com.zhb.ApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class JobDemoTest extends ApplicationTest {

    @Autowired
    private JobDemo jobDemo;

    @Test
    public void insertCustomer() throws Exception {
        jobDemo.insertCustomer();
    }

    @Test
    public void insertCustomerByThread() throws Exception {
        jobDemo.insertCustomerByThread();
    }

}