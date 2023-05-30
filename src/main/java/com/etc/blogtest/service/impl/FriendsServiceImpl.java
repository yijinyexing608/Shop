package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.Friends;
import com.etc.blogtest.dao.FriendsDao;
import com.etc.blogtest.service.FriendsService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Friends)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("friendsService")
public class FriendsServiceImpl implements FriendsService {
    @Resource
    private FriendsDao friendsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Friends queryById(Long uid) {
        return this.friendsDao.queryById(uid);
    }

    

    /**
     * 新增数据
     *
     * @param friends 实例对象
     * @return 实例对象
     */
    @Override
    public Friends insert(Friends friends) {
        this.friendsDao.insert(friends);
        return friends;
    }

    /**
     * 修改数据
     *
     * @param friends 实例对象
     * @return 实例对象
     */
    @Override
    public Friends update(Friends friends) {
        this.friendsDao.update(friends);
        return this.queryById(friends.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long uid) {
        return this.friendsDao.deleteById(uid) > 0;
    }
}
