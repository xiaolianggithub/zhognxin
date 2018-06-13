package com.zhongxin.mapper;

import com.zhongxin.pojo.Groupauthorityrelation;
import com.zhongxin.pojo.GroupauthorityrelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupauthorityrelationMapper {
    int countByExample(GroupauthorityrelationExample example);

    int deleteByExample(GroupauthorityrelationExample example);

    int deleteByPrimaryKey(Long groupAuthorityRelationId);

    int insert(Groupauthorityrelation record);

    int insertSelective(Groupauthorityrelation record);

    List<Groupauthorityrelation> selectByExample(GroupauthorityrelationExample example);

    Groupauthorityrelation selectByPrimaryKey(Long groupAuthorityRelationId);

    int updateByExampleSelective(@Param("record") Groupauthorityrelation record, @Param("example") GroupauthorityrelationExample example);

    int updateByExample(@Param("record") Groupauthorityrelation record, @Param("example") GroupauthorityrelationExample example);

    int updateByPrimaryKeySelective(Groupauthorityrelation record);

    int updateByPrimaryKey(Groupauthorityrelation record);
}