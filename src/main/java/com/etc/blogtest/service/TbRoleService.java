package com.etc.blogtest.service;

import com.etc.blogtest.entity.TbRole;


/**
 * (TbRole)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    TbRole queryById(Integer rid);

   
    /**
     * 新增数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    TbRole insert(TbRole tbRole);

    /**
     * 修改数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    TbRole update(TbRole tbRole);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rid);

}
