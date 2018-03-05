package com.zking.zf.biz.impl;

import com.zking.zf.biz.INewsBiz;
import com.zking.zf.mapper.NewsMapper;
import com.zking.zf.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsBizImpl implements INewsBiz {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News loadNews(News news) {
        return newsMapper.loadNews(news);
    }

    @Override
    public void addCategory(News news) {
        newsMapper.addCategory(news);
    }

    @Override
    public void delCategory(News news) {
        newsMapper.delCategory(news);
    }

    @Override
    public void del(News news) {
        newsMapper.delByNewsId(news);
        newsMapper.deleteByPrimaryKey(news.getNewsId());
    }
}
