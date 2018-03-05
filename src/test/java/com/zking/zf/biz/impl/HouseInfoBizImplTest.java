package com.zking.zf.biz.impl;

import com.zking.zf.biz.IHouseInfoBiz;
import com.zking.zf.model.HouseInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class HouseInfoBizImplTest extends BaseTest {

    @Autowired
    private IHouseInfoBiz houseInfoBiz;

    private HouseInfo houseInfo;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        houseInfo = new HouseInfo();
    }

    @Test
    public void add() throws Exception {
        houseInfo.setTitle("全新装修wifi高档次公寓房");
        houseInfo.setAddress("芙蓉区远大一路280号");
        houseInfo.setMoney(3600);
        houseInfo.setLinkman("何先生");
        houseInfo.setPhone("18307485217");
        houseInfo.setHouseType(2);
        houseInfo.setZxqk(2);
        houseInfo.setSzlc(3);
        houseInfo.setFwcx(5);
        houseInfo.setRemark("拎包入住，温馨高档方便！可日租，月租均可！");
        houseInfo.setUserEmp(2);
        houseInfoBiz.add(houseInfo);
    }

    @Test
    public void del() throws Exception {
        houseInfo.setHouseId(1);
        houseInfoBiz.del(houseInfo);
    }

    @Test
    public void edit() throws Exception {
        houseInfo.setHouseId(4);
        houseInfo.setRemark("拎包入住，温馨高档方便！可日租，月租均可！222222222222222");
        houseInfoBiz.edit(houseInfo);
    }

    @Test
    public void load() throws Exception {
        houseInfo.setHouseId(4);
        HouseInfo houseInfo1 = houseInfoBiz.load(houseInfo);
        System.out.println(houseInfo1);
    }

    @Test
    public void list() throws Exception {
        pageBean.setCurPage(1);
        pageBean.setPageRecord(3);
        houseInfo.setTitle("2");
        List<HouseInfo> houseInfoList = houseInfoBiz.list(houseInfo, null);
        for (int i = 0;i<houseInfoList.size();i++) {
            System.out.println(i);
        }
    }

}