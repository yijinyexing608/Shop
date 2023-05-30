package com.etc.blogtest.entity;

import java.io.Serializable;

/**
 * (TbUserRole)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class TbUserRole implements Serializable {
    private static final long serialVersionUID = -99091244164150891L;
    
    private Integer id;
    /**
     * 用户id
     */
    private Long uid;
    /**
     * 角色id
     */
    private Integer rid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

}

