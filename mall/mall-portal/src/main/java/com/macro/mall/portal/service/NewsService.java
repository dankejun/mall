package com.macro.mall.portal.service;

import com.macro.mall.model.NmsNews;

import java.util.List;
/**
 * 新闻查看Service
 * Created by macro on 2019/11/23.
 */
public interface NewsService {
    /**
     * 通过新闻ID返回新闻实体
     * @param ID
     * @return
     */
    NmsNews getnewByid(Integer ID);

    /**
     * 通过新闻类别ID返回实体集
     * @param categoryID
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<NmsNews> getnewBycategory(Integer categoryID, Integer pageSize, Integer pageNum);
}
