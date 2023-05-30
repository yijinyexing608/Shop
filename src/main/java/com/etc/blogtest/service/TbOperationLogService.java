package com.etc.blogtest.service;

import com.etc.blogtest.entity.TbOperationLog;


/**
 * (TbOperationLog)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface TbOperationLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbOperationLog queryById(Integer id);

   
    /**
     * 新增数据
     *
     * @param tbOperationLog 实例对象
     * @return 实例对象
     */
    TbOperationLog insert(TbOperationLog tbOperationLog);

    /**
     * 修改数据
     *
     * @param tbOperationLog 实例对象
     * @return 实例对象
     */
    TbOperationLog update(TbOperationLog tbOperationLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
