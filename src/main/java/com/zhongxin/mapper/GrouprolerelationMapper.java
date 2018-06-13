package com.zhongxin.mapper;

import com.zhongxin.pojo.Grouprolerelation;
import com.zhongxin.pojo.GrouprolerelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrouprolerelationMapper {
    int countByExample(GrouprolerelationExample example);

    int deleteByExample(GrouprolerelationExample example);

    int deleteByPrimaryKey(Long groupRoleRelationId);

    int insert(Grouprolerelation record);

    int insertSelective(Grouprolerelation record);

    List<Grouprolerelation> selectByExample(GrouprolerelationExample example);

    Grouprolerelation selectByPrimaryKey(Long groupRoleRelationId);

    int updateByExampleSelective(@Param("record") Grouprolerelation record, @Param("example") GrouprolerelationExample example);

    int updateByExample(@Param("record") Grouprolerelation record, @Param("example") GrouprolerelationExample example);

    int updateByPrimaryKeySelective(Grouprolerelation record);

    int updateByPrimaryKey(Grouprolerelation record);
}