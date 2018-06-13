package com.zhongxin.pojo;

public class Authority {
    private Long authorityId;

    private Long parentAuthorityId;

    private String authorityName;

    private String description;

    public Long getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    public Long getParentAuthorityId() {
        return parentAuthorityId;
    }

    public void setParentAuthorityId(Long parentAuthorityId) {
        this.parentAuthorityId = parentAuthorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}