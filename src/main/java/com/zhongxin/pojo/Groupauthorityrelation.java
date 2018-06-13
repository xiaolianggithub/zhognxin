package com.zhongxin.pojo;

public class Groupauthorityrelation {
    private Long groupAuthorityRelationId;

    private Long groupId;

    private Long authorityId;

    private Integer authorityType;

    public Long getGroupAuthorityRelationId() {
        return groupAuthorityRelationId;
    }

    public void setGroupAuthorityRelationId(Long groupAuthorityRelationId) {
        this.groupAuthorityRelationId = groupAuthorityRelationId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    public Integer getAuthorityType() {
        return authorityType;
    }

    public void setAuthorityType(Integer authorityType) {
        this.authorityType = authorityType;
    }
}