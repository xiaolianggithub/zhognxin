package com.zhongxin.mapper;

import com.zhongxin.pojo.Userauthorityrelation;
import com.zhongxin.pojo.UserauthorityrelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserauthorityrelationMapper {
    int countByExample(UserauthorityrelationExample example);

    int deleteByExample(UserauthorityrelationExample example);

    int deleteByPrimaryKey(Long userRoleRelationId);

    int insert(Userauthorityrelation record);

    int insertSelective(Userauthorityrelation record);

    List<Userauthorityrelation> selectByExample(UserauthorityrelationExample example);

    Userauthorityrelation selectByPrimaryKey(Long userRoleRelationId);

    int updateByExampleSelective(@Param("record") Userauthorityrelation record, @Param("example") UserauthorityrelationExample example);

    int updateByExample(@Param("record") Userauthorityrelation record, @Param("example") UserauthorityrelationExample example);

    int updateByPrimaryKeySelective(Userauthorityrelation record);

    int updateByPrimaryKey(Userauthorityrelation record);
}