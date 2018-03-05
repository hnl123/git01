package com.zking.zf.biz.impl;

import com.zking.zf.biz.IHouseTypeBiz;
import com.zking.zf.mapper.HouseTypeMapper;
import com.zking.zf.model.HouseType;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseTypeBizImpl implements IHouseTypeBiz {

    @Autowired
    private HouseTypeMapper houseTypeMapper;

    @Override
    public void add(HouseType houseType) {
        houseTypeMapper.insert(houseType);
    }

    @Override
    public List<HouseType> list(HouseType houseType, PageBean pageBean){
        return houseTypeMapper.list(houseType);
    }

    @Override
    public HouseType load(HouseType houseType) {
        return houseTypeMapper.selectByPrimaryKey(houseType.getTypeId());
    }

}
