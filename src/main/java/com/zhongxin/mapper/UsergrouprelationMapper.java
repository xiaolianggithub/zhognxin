package com.zhongxin.mapper;

import com.zhongxin.pojo.Usergrouprelation;
import com.zhongxin.pojo.UsergrouprelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergrouprelationMapper {
    int countByExample(UsergrouprelationExample example);

    int deleteByExample(UsergrouprelationExample example);

    int deleteByPrimaryKey(Long userGroupRelationId);

    int insert(Usergrouprelation record);

    int insertSelective(Usergrouprelation record);

    List<Usergrouprelation> selectByExample(UsergrouprelationExample example);

    Usergrouprelation selectByPrimaryKey(Long userGroupRelationId);

    int updateByExampleSelective(@Param("record") Usergrouprelation record, @Param("example") UsergrouprelationExample example);

    int updateByExample(@Param("record") Usergrouprelation record, @Param("example") UsergrouprelationExample example);

    int updateByPrimaryKeySelective(Usergrouprelation record);

    int updateByPrimaryKey(Usergrouprelation record);
}