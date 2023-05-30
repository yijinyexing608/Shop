package com.etc.blogtest.service;

import com.etc.blogtest.entity.ThumbsUp;


/**
 * (ThumbsUp)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface ThumbsUpService {

    /**
     * 通过ID查询单条数据
     *
     * @param blogId 主键
     * @return 实例对象
     */
    ThumbsUp queryById(Long blogId);

   
    /**
     * 新增数据
     *
     * @param thumbsUp 实例对象
     * @return 实例对象
     */
    ThumbsUp insert(ThumbsUp thumbsUp);

    /**
     * 修改数据
     *
     * @param thumbsUp 实例对象
     * @return 实例对象
     */
    ThumbsUp update(ThumbsUp thumbsUp);

    /**
     * 通过主键删除数据
     *
     * @param blogId 主键
     * @return 是否成功
     */
    boolean deleteById(Long blogId);

}
