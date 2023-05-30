package com.etc.blogtest.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbOrder)实体类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public class TbOrder implements Serializable {
    private static final long serialVersionUID = -31469408339384438L;
    
    private String payId;
    
    private Long uid;
    
    private Integer type;
    
    private String price;
    
    private String reallyPrice;
    /**
     * 创建时间
     */
    private Date createTime;


    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReallyPrice() {
        return reallyPrice;
    }

    public void setReallyPrice(String reallyPrice) {
        this.reallyPrice = reallyPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

