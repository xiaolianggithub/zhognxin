package com.zhongxin.mapper;

import com.zhongxin.pojo.Roleauthorityrelation;
import com.zhongxin.pojo.RoleauthorityrelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleauthorityrelationMapper {
    int countByExample(RoleauthorityrelationExample example);

    int deleteByExample(RoleauthorityrelationExample example);

    int deleteByPrimaryKey(Long roleAuthorityRelationId);

    int insert(Roleauthorityrelation record);

    int insertSelective(Roleauthorityrelation record);

    List<Roleauthorityrelation> selectByExample(RoleauthorityrelationExample example);

    Roleauthorityrelation selectByPrimaryKey(Long roleAuthorityRelationId);

    int updateByExampleSelective(@Param("record") Roleauthorityrelation record, @Param("example") RoleauthorityrelationExample example);

    int updateByExample(@Param("record") Roleauthorityrelation record, @Param("example") RoleauthorityrelationExample example);

    int updateByPrimaryKeySelective(Roleauthorityrelation record);

    int updateByPrimaryKey(Roleauthorityrelation record);
}