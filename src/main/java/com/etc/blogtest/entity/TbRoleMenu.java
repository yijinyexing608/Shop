package com.etc.blogtest.entity;

import java.io.Serializable;

/**
 * (TbRoleMenu)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class TbRoleMenu implements Serializable {
    private static final long serialVersionUID = -46141335180731114L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 角色id
     */
    private Integer rid;
    /**
     * 菜单id
     */
    private Integer menuId;


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

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}

