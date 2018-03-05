package com.zking.zf.biz.impl;

import com.zking.zf.biz.IHouseTypeBiz;
import com.zking.zf.util.PageBean;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BaseTest {

    protected PageBean pageBean;

    @Before
    public void setUp() throws Exception {
        pageBean = new PageBean();
    }
}
