package com.zking.zf.mapper;

import com.zking.zf.model.News;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    News loadNews(News news);

    void addCategory(News news);

    void delCategory(News news);

    void delByNewsId(News news);
}