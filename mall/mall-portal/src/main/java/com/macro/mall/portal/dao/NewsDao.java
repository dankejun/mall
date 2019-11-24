package com.macro.mall.portal.dao;

import com.macro.mall.model.NmsNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 新闻自定义Dao
 */
public interface NewsDao {
    /**
     *通过新闻id来返回新闻实体
     *
     */
    NmsNews getnewByid(@Param("ID")Integer ID);

    /**
     *通过新闻的分类id来返回此类的实体集
     *
     */
    List<NmsNews> getnewBycategory(@Param("categoryID") Integer categoryID);
}
