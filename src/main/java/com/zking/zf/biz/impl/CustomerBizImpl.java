package com.zking.zf.biz.impl;

import com.zking.zf.biz.ICustomerBiz;
import com.zking.zf.mapper.CustomerMapper;
import com.zking.zf.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerBizImpl implements ICustomerBiz {

    @Autowired
    private CustomerMapper customerMapper;
    
    @Override
    public Customer load(Customer customer) {
        return customerMapper.load(customer);
    }
}
