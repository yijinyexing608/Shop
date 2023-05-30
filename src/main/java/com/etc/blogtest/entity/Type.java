package com.etc.blogtest.entity;

import java.io.Serializable;

/**
 * (Type)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class Type implements Serializable {
    private static final long serialVersionUID = -12686001370694462L;
    
    private Integer typeId;
    
    private String typeName;


    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}

