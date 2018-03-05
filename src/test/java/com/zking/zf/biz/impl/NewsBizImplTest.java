package com.zking.zf.biz.impl;

import com.zking.zf.biz.INewsBiz;
import com.zking.zf.model.Category;
import com.zking.zf.model.News;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NewsBizImplTest extends BaseTest {

    @Autowired
    private INewsBiz newsBiz;

    private News news;

    public void setUp() throws Exception {
        super.setUp();
        news = new News();
    }

    @Test
    public void loadNews() throws Exception {
        news.setNewsId(1);
        News n = newsBiz.loadNews(news);
        System.out.println(n);
        for (Category c : n.getCategoryList()) {
            System.out.println(c);
        }
    }

    @Test
    public void addCategory() throws Exception {
        news.setNewsId(5);
        news.setCategoryId(2);
        newsBiz.addCategory(news);
    }

    @Test
    public void delCategory() throws Exception {
        news.setNewsId(5);
        news.setCategoryId(2);
        newsBiz.delCategory(news);
    }

    @Test
    public void del() throws Exception {
        news.setNewsId(5);
        newsBiz.del(news);
    }

}