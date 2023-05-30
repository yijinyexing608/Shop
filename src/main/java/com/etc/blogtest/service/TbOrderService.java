package com.etc.blogtest.service;

import com.etc.blogtest.entity.TbOrder;


/**
 * (TbOrder)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param payId 主键
     * @return 实例对象
     */
    TbOrder queryById(String payId);

   
    /**
     * 新增数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    TbOrder insert(TbOrder tbOrder);

    /**
     * 修改数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    TbOrder update(TbOrder tbOrder);

    /**
     * 通过主键删除数据
     *
     * @param payId 主键
     * @return 是否成功
     */
    boolean deleteById(String payId);

}
