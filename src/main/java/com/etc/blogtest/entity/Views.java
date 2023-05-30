package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Views)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class Views implements Serializable {
    private static final long serialVersionUID = -86586955029291688L;
    
    private Long id;
    /**
     * 访问的博客id
     */
    private Long blogId;
    /**
     * 访问的时间
     */
    private Date createTime;
    /**
     * 浏览量
     */
    private Integer count;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}

