package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbRole)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class TbRole implements Serializable {
    private static final long serialVersionUID = 128782972139202082L;
    /**
     * 主键id
     */
    private Integer rid;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleLabel;
    /**
     * 是否禁用  0否 1是
     */
    private Integer isDisable;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleLabel() {
        return roleLabel;
    }

    public void setRoleLabel(String roleLabel) {
        this.roleLabel = roleLabel;
    }

    public Integer getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
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

