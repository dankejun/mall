package com.macro.mall.mapper;

import com.macro.mall.model.NmsNews;
import com.macro.mall.model.NmsNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NmsNewsMapper {
    long countByExample(NmsNewsExample example);

    int deleteByExample(NmsNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NmsNews record);

    int insertSelective(NmsNews record);

    List<NmsNews> selectByExample(NmsNewsExample example);

    NmsNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NmsNews record, @Param("example") NmsNewsExample example);

    int updateByExample(@Param("record") NmsNews record, @Param("example") NmsNewsExample example);

    int updateByPrimaryKeySelective(NmsNews record);

    int updateByPrimaryKey(NmsNews record);
}