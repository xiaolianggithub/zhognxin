package com.zhongxin.pojo;

public class Roleauthorityrelation {
    private Long roleAuthorityRelationId;

    private Long roleId;

    private Long authorityId;

    private Integer authorityType;

    public Long getRoleAuthorityRelationId() {
        return roleAuthorityRelationId;
    }

    public void setRoleAuthorityRelationId(Long roleAuthorityRelationId) {
        this.roleAuthorityRelationId = roleAuthorityRelationId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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