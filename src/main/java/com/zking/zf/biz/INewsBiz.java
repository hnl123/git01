package com.zking.zf.biz;

import com.zking.zf.model.News;

public interface INewsBiz {

    News loadNews(News news);

    void addCategory(News news);

    void delCategory(News news);

    void del(News news);
}
