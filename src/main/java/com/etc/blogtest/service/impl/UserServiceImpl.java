package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.User;
import com.etc.blogtest.dao.UserDao;
import com.etc.blogtest.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.Map;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long uid) {
        return this.userDao.queryById(uid);
    }

    @Override
    public User login(Map<String, Object> params) {
        return userDao.login(params);
    }


    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long uid) {
        return this.userDao.deleteById(uid) > 0;
    }
}
