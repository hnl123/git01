package com.zking.zf.biz;

import com.zking.zf.model.HouseType;
import com.zking.zf.util.PageBean;

import java.util.List;

public interface IHouseTypeBiz {

    void add(HouseType houseType);

    List<HouseType> list(HouseType houseType, PageBean pageBean);

    HouseType load(HouseType houseType);
}
