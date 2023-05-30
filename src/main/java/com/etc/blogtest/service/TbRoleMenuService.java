package com.etc.blogtest.service;

import com.etc.blogtest.entity.TbRoleMenu;


/**
 * (TbRoleMenu)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbRoleMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbRoleMenu queryById(Integer id);

   
    /**
     * 新增数据
     *
     * @param tbRoleMenu 实例对象
     * @return 实例对象
     */
    TbRoleMenu insert(TbRoleMenu tbRoleMenu);

    /**
     * 修改数据
     *
     * @param tbRoleMenu 实例对象
     * @return 实例对象
     */
    TbRoleMenu update(TbRoleMenu tbRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
