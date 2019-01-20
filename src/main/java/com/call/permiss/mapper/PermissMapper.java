package com.call.permiss.mapper;

import com.call.permiss.bean.Permiss;
import com.call.permiss.bean.PermissExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissMapper {
    int countByExample(PermissExample example);

    int deleteByExample(PermissExample example);

    int deleteByPrimaryKey(Integer peid);

    int insert(Permiss record);

    int insertSelective(Permiss record);

    List<Permiss> selectByExample(PermissExample example);

    Permiss selectByPrimaryKey(Integer peid);

    int updateByExampleSelective(@Param("record") Permiss record, @Param("example") PermissExample example);

    int updateByExample(@Param("record") Permiss record, @Param("example") PermissExample example);

    int updateByPrimaryKeySelective(Permiss record);

    int updateByPrimaryKey(Permiss record);
}