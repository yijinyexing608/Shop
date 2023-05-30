package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Friends)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class Friends implements Serializable {
    private static final long serialVersionUID = 375435830554073054L;
    /**
     * '用户本人的id'
     */
    private Long uid;
    /**
     * '拥有的朋友的id'
     */
    private Long friendId;
    /**
     * '添加好友的时间'
     */
    private Date createTime;


    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getFriendId() {
        return friendId;
    }

    public void setFriendId(Long friendId) {
        this.friendId = friendId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

