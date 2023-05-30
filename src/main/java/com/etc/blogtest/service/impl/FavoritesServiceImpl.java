package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.Favorites;
import com.etc.blogtest.dao.FavoritesDao;
import com.etc.blogtest.service.FavoritesService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Favorites)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("favoritesService")
public class FavoritesServiceImpl implements FavoritesService {
    @Resource
    private FavoritesDao favoritesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param blogId 主键
     * @return 实例对象
     */
    @Override
    public Favorites queryById(Long blogId) {
        return this.favoritesDao.queryById(blogId);
    }

    

    /**
     * 新增数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    @Override
    public Favorites insert(Favorites favorites) {
        this.favoritesDao.insert(favorites);
        return favorites;
    }

    /**
     * 修改数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    @Override
    public Favorites update(Favorites favorites) {
        this.favoritesDao.update(favorites);
        return this.queryById(favorites.getBlogId());
    }

    /**
     * 通过主键删除数据
     *
     * @param blogId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long blogId) {
        return this.favoritesDao.deleteById(blogId) > 0;
    }
}
