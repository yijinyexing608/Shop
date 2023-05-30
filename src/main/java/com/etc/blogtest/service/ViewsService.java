package com.etc.blogtest.service;

import com.etc.blogtest.entity.Views;


/**
 * (Views)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface ViewsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Views queryById(Long id);

   
    /**
     * 新增数据
     *
     * @param views 实例对象
     * @return 实例对象
     */
    Views insert(Views views);

    /**
     * 修改数据
     *
     * @param views 实例对象
     * @return 实例对象
     */
    Views update(Views views);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
