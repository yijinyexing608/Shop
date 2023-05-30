package com.etc.blogtest.entity;

import java.io.Serializable;

/**
 * (Tag)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public class Tag implements Serializable {
    private static final long serialVersionUID = -40802363969419977L;
    
    private Integer tagId;
    
    private String tagName;


    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}

