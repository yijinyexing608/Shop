package com.etc.blogtest.service;

import com.etc.blogtest.entity.TbMenu;


/**
 * (TbMenu)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface TbMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbMenu queryById(Integer id);

   
    /**
     * 新增数据
     *
     * @param tbMenu 实例对象
     * @return 实例对象
     */
    TbMenu insert(TbMenu tbMenu);

    /**
     * 修改数据
     *
     * @param tbMenu 实例对象
     * @return 实例对象
     */
    TbMenu update(TbMenu tbMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
