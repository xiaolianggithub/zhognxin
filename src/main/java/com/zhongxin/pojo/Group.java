package com.zhongxin.pojo;

import java.util.Date;

public class Group {
    private Long groupId;

    private Long parentAuthorityId;

    private String groupName;

    private Long parentGroupId;

    private Date createTime;

    private String description;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getParentAuthorityId() {
        return parentAuthorityId;
    }

    public void setParentAuthorityId(Long parentAuthorityId) {
        this.parentAuthorityId = parentAuthorityId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Long getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(Long parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}