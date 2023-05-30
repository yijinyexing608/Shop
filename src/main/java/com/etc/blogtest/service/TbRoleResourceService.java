package com.etc.blogtest.service;

import com.etc.blogtest.entity.TbRoleResource;


/**
 * (TbRoleResource)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbRoleResourceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbRoleResource queryById(Integer id);

   
    /**
     * 新增数据
     *
     * @param tbRoleResource 实例对象
     * @return 实例对象
     */
    TbRoleResource insert(TbRoleResource tbRoleResource);

    /**
     * 修改数据
     *
     * @param tbRoleResource 实例对象
     * @return 实例对象
     */
    TbRoleResource update(TbRoleResource tbRoleResource);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
