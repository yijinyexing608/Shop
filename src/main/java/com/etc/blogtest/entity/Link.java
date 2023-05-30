package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Link)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class Link implements Serializable {
    private static final long serialVersionUID = 565365312380818495L;
    /**
     * 友链id
     */
    private Long linkId;
    /**
     * 友链名称
     */
    private String linkName;
    /**
     * 友链头像地址
     */
    private String avatarLink;
    /**
     * 友链地址
     */
    private String blogLink;
    /**
     * 友链博客描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 友链展示状态
     */
    private Integer status;


    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public String getBlogLink() {
        return blogLink;
    }

    public void setBlogLink(String blogLink) {
        this.blogLink = blogLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

