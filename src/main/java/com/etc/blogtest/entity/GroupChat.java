package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (GroupChat)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class GroupChat implements Serializable {
    private static final long serialVersionUID = -66685235417171090L;
    /**
     * 消息id
     */
    private Long msgId;
    /**
     * 用户id
     */
    private Long uid;
    
    private String content;
    /**
     * 发送消息的时间
     */
    private Date createTime;
    /**
     * 群聊id
     */
    private Long roomId;
    /**
     * 1：文字消息；2：图片
     */
    private Integer textType;


    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
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

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getTextType() {
        return textType;
    }

    public void setTextType(Integer textType) {
        this.textType = textType;
    }

}

