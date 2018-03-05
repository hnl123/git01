package com.zking.zf.biz.impl;

import com.zking.zf.biz.IOrderBiz;
import com.zking.zf.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class OrderBizImplTest extends BaseTest {

    @Autowired
    private IOrderBiz orderBiz;

    private Order order;

    public void setUp() throws Exception {
        super.setUp();
        order = new Order();
    }

    @Test
    public void load() throws Exception {
        order.setOrderId(1);
        Order o = orderBiz.load(order);
        System.out.println(o);
        System.out.println(o.getCustomer());
    }

}