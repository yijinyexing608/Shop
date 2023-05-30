package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Message)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 784571984807081240L;
    /**
     * 留言id
     */
    private Long mid;
    /**
     * 弹幕过屏时间
     */
    private String time;
    /**
     * 留言内容
     */
    private String messageContent;
    /**
     * 创建时间
     */
    private Date createTime;
    
    private String avatar;
    
    private String nickname;
    /**
     * ip地址
     */
    private String ip;
    /**
     * 'ip来源'
     */
    private String ipSource;


    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }

}

