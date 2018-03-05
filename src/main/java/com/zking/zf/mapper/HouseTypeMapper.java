package com.zking.zf.mapper;

import com.zking.zf.model.HouseType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseTypeMapper {

    int deleteByPrimaryKey(Integer typeId);

    int insert(HouseType record);

    int insertSelective(HouseType record);

    HouseType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(HouseType record);

    int updateByPrimaryKey(HouseType record);

    List<HouseType> list(HouseType houseType);

}