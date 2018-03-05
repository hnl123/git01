package com.zking.zf.biz.impl;

import com.zking.zf.biz.ICustomerBiz;
import com.zking.zf.model.Customer;
import com.zking.zf.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustomerBizImplTest extends BaseTest {

    @Autowired
    private ICustomerBiz customerBiz;

    private Customer customer;

    public void setUp() throws Exception {
        super.setUp();
        customer = new Customer();
    }

    @Test
    public void load() throws Exception {
        customer.setCustomerId(1);
        Customer c = customerBiz.load(customer);
        System.out.println(c);
        for (Order o : c.getOrderList()) {
            System.out.println(o);
        }
    }

}