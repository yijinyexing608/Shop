package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Favorites)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class Favorites implements Serializable {
    private static final long serialVersionUID = -47647017212064337L;
    
    private Long blogId;
    
    private Long uid;
    /**
     * 收藏时间
     */
    private Date createTime;


    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

