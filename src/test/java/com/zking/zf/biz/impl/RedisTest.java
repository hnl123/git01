package com.zking.zf.biz.impl;

import com.zking.zf.biz.IHouseInfoBiz;
import com.zking.zf.model.HouseInfo;
import com.zking.zf.redis.RedisUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RedisTest extends BaseTest {

    @Autowired
    private IHouseInfoBiz houseInfoBiz;

    private HouseInfo houseInfo;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        houseInfo = new HouseInfo();
    }


    @Test
    public void load() throws Exception {
        houseInfo.setHouseId(4);
        //redis---mybatis
        HouseInfo h = (HouseInfo) redisUtil.get(houseInfo.getClass().getName()+"_"+houseInfo.getHouseId());
        if (null==h) {
            h = houseInfoBiz.load(houseInfo);
            if (null!=h) {
                redisUtil.set(h.getClass().getName() + "_" + h.getHouseId(),h);
            }
        }
        System.out.println(h);
    }

    @Test
    public void list() throws Exception {
        pageBean.setCurPage(1);
        pageBean.setPageRecord(3);
        List<HouseInfo> houseInfoList = houseInfoBiz.list(houseInfo, null);
        for (int i = 0;i<houseInfoList.size();i++) {
            System.out.println(i);
        }
    }

    public String getKey() {

        return this.getClass().getName()+"_"+this.houseInfo.getHouseId();
    }

}