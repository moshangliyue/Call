package com.call.geton.mapper;


import com.call.geton.bean.Geton;
import com.call.geton.bean.GetonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GetonMapper {
    int countByExample(GetonExample example);

    int deleteByExample(GetonExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Geton record);

    int insertSelective(Geton record);

    List<Geton> selectByExample(GetonExample example);

    Geton selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Geton record, @Param("example") GetonExample example);

    int updateByExample(@Param("record") Geton record, @Param("example") GetonExample example);

    int updateByPrimaryKeySelective(Geton record);

    int updateByPrimaryKey(Geton record);
}