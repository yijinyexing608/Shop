package com.etc.blogtest.service;

import com.etc.blogtest.entity.Link;


/**
 * (Link)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface LinkService {

    /**
     * 通过ID查询单条数据
     *
     * @param linkId 主键
     * @return 实例对象
     */
    Link queryById(Long linkId);

   
    /**
     * 新增数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    Link insert(Link link);

    /**
     * 修改数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    Link update(Link link);

    /**
     * 通过主键删除数据
     *
     * @param linkId 主键
     * @return 是否成功
     */
    boolean deleteById(Long linkId);

}
