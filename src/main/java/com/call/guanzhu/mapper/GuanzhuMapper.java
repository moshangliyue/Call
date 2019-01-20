package com.call.guanzhu.mapper;


import com.call.guanzhu.bean.Guanzhu;
import com.call.guanzhu.bean.GuanzhuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuanzhuMapper {
    int countByExample(GuanzhuExample example);

    int deleteByExample(GuanzhuExample example);

    int deleteByPrimaryKey(Integer guanzhuid);

    int insert(Guanzhu record);

    int insertSelective(Guanzhu record);

    List<Guanzhu> selectByExample(GuanzhuExample example);

    Guanzhu selectByPrimaryKey(Integer guanzhuid);

    int updateByExampleSelective(@Param("record") Guanzhu record, @Param("example") GuanzhuExample example);

    int updateByExample(@Param("record") Guanzhu record, @Param("example") GuanzhuExample example);

    int updateByPrimaryKeySelective(Guanzhu record);

    int updateByPrimaryKey(Guanzhu record);
}