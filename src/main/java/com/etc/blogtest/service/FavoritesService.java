package com.etc.blogtest.service;

import com.etc.blogtest.entity.Favorites;


/**
 * (Favorites)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface FavoritesService {

    /**
     * 通过ID查询单条数据
     *
     * @param blogId 主键
     * @return 实例对象
     */
    Favorites queryById(Long blogId);

   
    /**
     * 新增数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    Favorites insert(Favorites favorites);

    /**
     * 修改数据
     *
     * @param favorites 实例对象
     * @return 实例对象
     */
    Favorites update(Favorites favorites);

    /**
     * 通过主键删除数据
     *
     * @param blogId 主键
     * @return 是否成功
     */
    boolean deleteById(Long blogId);

}
