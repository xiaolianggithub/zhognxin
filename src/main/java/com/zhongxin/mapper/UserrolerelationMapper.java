package com.zhongxin.mapper;

import com.zhongxin.pojo.Userrolerelation;
import com.zhongxin.pojo.UserrolerelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrolerelationMapper {
    int countByExample(UserrolerelationExample example);

    int deleteByExample(UserrolerelationExample example);

    int deleteByPrimaryKey(Long userRoleId);

    int insert(Userrolerelation record);

    int insertSelective(Userrolerelation record);

    List<Userrolerelation> selectByExample(UserrolerelationExample example);

    Userrolerelation selectByPrimaryKey(Long userRoleId);

    int updateByExampleSelective(@Param("record") Userrolerelation record, @Param("example") UserrolerelationExample example);

    int updateByExample(@Param("record") Userrolerelation record, @Param("example") UserrolerelationExample example);

    int updateByPrimaryKeySelective(Userrolerelation record);

    int updateByPrimaryKey(Userrolerelation record);
}