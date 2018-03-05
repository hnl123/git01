package com.zking.zf.biz.impl;

import com.zking.zf.biz.IHouseTypeBiz;
import com.zking.zf.model.HouseType;
import com.zking.zf.redis.RedisCache;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class HouseTypeBizImplTest extends BaseTest{

    @Autowired
    private IHouseTypeBiz houseTypeBiz;

    private HouseType houseType;


    @Override
    public void setUp() throws Exception {
        super.setUp();
        houseType = new HouseType();
    }

    @Test
    public void add() throws Exception {
        houseType.setTypeName("心愿别墅");
        houseTypeBiz.add(houseType);
    }

    @Test
    public void list() throws Exception {
        List<HouseType> houseTypeList = houseTypeBiz.list(houseType, null);
        for (HouseType h : houseTypeList) {
            System.out.println(h);
        }
    }

    @Test
    public void load() throws Exception {
        houseType.setTypeId(2);
        HouseType houseType1 = houseTypeBiz.load(houseType);
        System.out.println(houseType1);

        houseTypeBiz.load(houseType);
    }

}