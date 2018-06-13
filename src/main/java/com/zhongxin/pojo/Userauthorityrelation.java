package com.zhongxin.pojo;

public class Userauthorityrelation {
    private Long userRoleRelationId;

    private Long userId;

    private Long authorityId;

    private Integer rightType;

    public Long getUserRoleRelationId() {
        return userRoleRelationId;
    }

    public void setUserRoleRelationId(Long userRoleRelationId) {
        this.userRoleRelationId = userRoleRelationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    public Integer getRightType() {
        return rightType;
    }

    public void setRightType(Integer rightType) {
        this.rightType = rightType;
    }
}