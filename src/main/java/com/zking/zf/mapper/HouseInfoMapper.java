package com.zking.zf.mapper;

import com.zking.zf.model.HouseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseInfoMapper {
    int deleteByPrimaryKey(Integer houseId);

    int insert(HouseInfo record);

    int insertSelective(HouseInfo record);

    HouseInfo selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(HouseInfo record);

    int updateByPrimaryKey(HouseInfo record);

    List<HouseInfo> list(HouseInfo houseInfo);
}