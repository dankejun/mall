package com.macro.mall.mapper;

import com.macro.mall.model.NmsNewsCategory;
import com.macro.mall.model.NmsNewsCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NmsNewsCategoryMapper {
    long countByExample(NmsNewsCategoryExample example);

    int deleteByExample(NmsNewsCategoryExample example);

    int deleteByPrimaryKey(Integer categoryid);

    int insert(NmsNewsCategory record);

    int insertSelective(NmsNewsCategory record);

    List<NmsNewsCategory> selectByExample(NmsNewsCategoryExample example);

    NmsNewsCategory selectByPrimaryKey(Integer categoryid);

    int updateByExampleSelective(@Param("record") NmsNewsCategory record, @Param("example") NmsNewsCategoryExample example);

    int updateByExample(@Param("record") NmsNewsCategory record, @Param("example") NmsNewsCategoryExample example);

    int updateByPrimaryKeySelective(NmsNewsCategory record);

    int updateByPrimaryKey(NmsNewsCategory record);
}