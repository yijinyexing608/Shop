package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ThumbsUp)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class ThumbsUp implements Serializable {
    private static final long serialVersionUID = 902669847679978262L;
    
    private Long blogId;
    /**
     * 用户id
     */
    private Long uid;
    /**
     * 点赞时间
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

