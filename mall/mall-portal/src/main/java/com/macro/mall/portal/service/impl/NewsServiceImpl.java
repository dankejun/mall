package com.macro.mall.portal.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.NmsNewsMapper;
import com.macro.mall.model.NmsNews;
import com.macro.mall.model.NmsNewsExample;
import com.macro.mall.portal.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 新闻查看Service实现类
 * Created by macro on 2019/11/23.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NmsNewsMapper nmsNewsMapper;

    @Override
    public NmsNews getnewByid(Integer ID) {
      return nmsNewsMapper.selectByPrimaryKey(ID);
    }

    @Override
    public List<NmsNews> getnewBycategory(Integer categoryID, Integer pageSize, Integer pageNum) {

        PageHelper.startPage(pageNum,pageSize);
        NmsNewsExample example = new NmsNewsExample();
        NmsNewsExample.Criteria criteria = example.createCriteria();
        if(categoryID!=null){
            criteria.andCategoryidEqualTo(categoryID);
        }
        return nmsNewsMapper.selectByExample(example);
    }
}
