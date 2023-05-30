package com.etc.blogtest.entity;

import java.io.Serializable;

/**
 * (TbRoleResource)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class TbRoleResource implements Serializable {
    private static final long serialVersionUID = -26000285161328941L;
    
    private Integer id;
    /**
     * 角色id
     */
    private Integer rid;
    /**
     * 权限id
     */
    private Integer resourceId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

}

