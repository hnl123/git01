package com.zking.zf.biz;

import com.zking.zf.model.HouseInfo;
import com.zking.zf.util.PageBean;

import java.util.List;

public interface IHouseInfoBiz {

    void add(HouseInfo houseInfo);

    void del(HouseInfo houseInfo);

    void edit(HouseInfo houseInfo);

    HouseInfo load(HouseInfo houseInfo);

    List<HouseInfo> list(HouseInfo houseInfo, PageBean pageBean);
}
