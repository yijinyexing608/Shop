package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbOperationLog)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class TbOperationLog implements Serializable {
    private static final long serialVersionUID = 492727136384866915L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 操作模块
     */
    private String optModule;
    /**
     * 操作类型
     */
    private String optType;
    /**
     * 操作url
     */
    private String optUrl;
    /**
     * 操作方法
     */
    private String optMethod;
    /**
     * 操作描述
     */
    private String optDesc;
    /**
     * 请求参数
     */
    private String requestParam;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 返回数据
     */
    private String responseData;
    /**
     * 用户id
     */
    private Long uid;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 操作ip
     */
    private String ipAddress;
    /**
     * 操作地址
     */
    private String ipSource;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOptModule() {
        return optModule;
    }

    public void setOptModule(String optModule) {
        this.optModule = optModule;
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }

    public String getOptUrl() {
        return optUrl;
    }

    public void setOptUrl(String optUrl) {
        this.optUrl = optUrl;
    }

    public String getOptMethod() {
        return optMethod;
    }

    public void setOptMethod(String optMethod) {
        this.optMethod = optMethod;
    }

    public String getOptDesc() {
        return optDesc;
    }

    public void setOptDesc(String optDesc) {
        this.optDesc = optDesc;
    }

    public String getRequestParam() {
        return requestParam;
    }

    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

