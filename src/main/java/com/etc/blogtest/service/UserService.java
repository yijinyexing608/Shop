package com.etc.blogtest.service;

import com.etc.blogtest.entity.User;

import java.util.Map;


/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    User queryById(Long uid);

    User login(Map<String,Object> params);
    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Long uid);

}
