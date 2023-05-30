package com.etc.blogtest.service;

import com.etc.blogtest.entity.TbResource;


/**
 * (TbResource)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbResourceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbResource queryById(Integer id);

   
    /**
     * 新增数据
     *
     * @param tbResource 实例对象
     * @return 实例对象
     */
    TbResource insert(TbResource tbResource);

    /**
     * 修改数据
     *
     * @param tbResource 实例对象
     * @return 实例对象
     */
    TbResource update(TbResource tbResource);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
