package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Blog)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = -94203588897685967L;
    /**
     * 博客id
     */
    private Long blogId;
    /**
     * 标题
     */
    private String title;
    
    private Long uid;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 发布状态
     */
    private Integer published;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 浏览次数
     */
    private Integer views;
    
    private Integer typeId;
    
    private String description;
    /**
     * 评论状态
     */
    private Integer commentAble;
    /**
     * 版权状态
     */
    private Integer copyright;


    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCommentAble() {
        return commentAble;
    }

    public void setCommentAble(Integer commentAble) {
        this.commentAble = commentAble;
    }

    public Integer getCopyright() {
        return copyright;
    }

    public void setCopyright(Integer copyright) {
        this.copyright = copyright;
    }

}

