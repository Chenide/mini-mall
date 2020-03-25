package com.mini.mall.model;

import java.io.Serializable;
import java.util.Date;

public class MallRoleDO implements Serializable {
    private Integer menuId;

    private Integer parentId;

    private String name;

    private String url;

    private String desc;

    private String level;

    private String type;

    private Integer resourceId;

    private Integer seq;

    private String status;

    private String isLeaf;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getMenuId() {
        return menuId;
    }

    public MallRoleDO withMenuId(Integer menuId) {
        this.setMenuId(menuId);
        return this;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public MallRoleDO withParentId(Integer parentId) {
        this.setParentId(parentId);
        return this;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public MallRoleDO withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public MallRoleDO withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public MallRoleDO withDesc(String desc) {
        this.setDesc(desc);
        return this;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLevel() {
        return level;
    }

    public MallRoleDO withLevel(String level) {
        this.setLevel(level);
        return this;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public MallRoleDO withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public MallRoleDO withResourceId(Integer resourceId) {
        this.setResourceId(resourceId);
        return this;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getSeq() {
        return seq;
    }

    public MallRoleDO withSeq(Integer seq) {
        this.setSeq(seq);
        return this;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getStatus() {
        return status;
    }

    public MallRoleDO withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public MallRoleDO withIsLeaf(String isLeaf) {
        this.setIsLeaf(isLeaf);
        return this;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public MallRoleDO withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public MallRoleDO withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", desc=").append(desc);
        sb.append(", level=").append(level);
        sb.append(", type=").append(type);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", seq=").append(seq);
        sb.append(", status=").append(status);
        sb.append(", isLeaf=").append(isLeaf);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}