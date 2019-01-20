package com.call.peisong.mapper;


import com.call.peisong.bean.Peisong;
import com.call.peisong.bean.PeisongExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeisongMapper {
    int countByExample(PeisongExample example);

    int deleteByExample(PeisongExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Peisong record);

    int insertSelective(Peisong record);

    List<Peisong> selectByExample(PeisongExample example);

    Peisong selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Peisong record, @Param("example") PeisongExample example);

    int updateByExample(@Param("record") Peisong record, @Param("example") PeisongExample example);

    int updateByPrimaryKeySelective(Peisong record);

    int updateByPrimaryKey(Peisong record);
}