package com.zking.zf.biz.impl;

import com.zking.zf.biz.IOrderBiz;
import com.zking.zf.mapper.OrderMapper;
import com.zking.zf.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderBizImpl implements IOrderBiz {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order load(Order order) {
        return orderMapper.load(order);
    }

}
