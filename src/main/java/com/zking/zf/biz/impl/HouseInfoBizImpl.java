package com.zking.zf.biz.impl;

import com.zking.zf.biz.IHouseInfoBiz;
import com.zking.zf.mapper.HouseInfoMapper;
import com.zking.zf.model.HouseInfo;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseInfoBizImpl implements IHouseInfoBiz {

    @Autowired
    private HouseInfoMapper houseInfoMapper;

    @Override
    public void add(HouseInfo houseInfo) {
        houseInfoMapper.insert(houseInfo);
    }

    @Override
    public void del(HouseInfo houseInfo) {
        houseInfoMapper.deleteByPrimaryKey(houseInfo.getHouseId());
    }

    @Override
    public void edit(HouseInfo houseInfo) {
        houseInfoMapper.updateByPrimaryKey(houseInfo);
    }

    @Override
    public HouseInfo load(HouseInfo houseInfo) {
        return houseInfoMapper.selectByPrimaryKey(houseInfo.getHouseId());
    }

    @Override
    public List<HouseInfo> list(HouseInfo houseInfo, PageBean pageBean) {
        return houseInfoMapper.list(houseInfo);
    }
}
