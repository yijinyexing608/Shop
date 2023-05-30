package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbResource)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class TbResource implements Serializable {
    private static final long serialVersionUID = -39608308410078452L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 资源名
     */
    private String resourceName;
    /**
     * 权限路径
     */
    private String url;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 父权限id
     */
    private Integer parentId;
    /**
     * 是否匿名访问 0否 1是
     */
    private Integer isAnonymous;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
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

