package com.etc.blogtest.service;

import com.etc.blogtest.entity.Friends;


/**
 * (Friends)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface FriendsService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Friends queryById(Long uid);

   
    /**
     * 新增数据
     *
     * @param friends 实例对象
     * @return 实例对象
     */
    Friends insert(Friends friends);

    /**
     * 修改数据
     *
     * @param friends 实例对象
     * @return 实例对象
     */
    Friends update(Friends friends);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Long uid);

}
