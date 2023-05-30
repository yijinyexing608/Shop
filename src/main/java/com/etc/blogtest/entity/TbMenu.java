package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbMenu)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class TbMenu implements Serializable {
    private static final long serialVersionUID = 737897753335885971L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 菜单名
     */
    private String name;
    /**
     * 菜单路径
     */
    private String path;
    /**
     * 组件
     */
    private String component;
    /**
     * 菜单icon
     */
    private String icon;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 排序
     */
    private Integer orderNum;
    /**
     * 父id
     */
    private Integer parentId;
    /**
     * 是否隐藏  0否1是
     */
    private Integer isHidden;
    /**
     * 1:用户的后台菜单；2:管理员的后台菜单
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Integer isHidden) {
        this.isHidden = isHidden;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}

