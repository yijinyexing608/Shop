package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.ThumbsUp;
import com.etc.blogtest.dao.ThumbsUpDao;
import com.etc.blogtest.service.ThumbsUpService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (ThumbsUp)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("thumbsUpService")
public class ThumbsUpServiceImpl implements ThumbsUpService {
    @Resource
    private ThumbsUpDao thumbsUpDao;

    /**
     * 通过ID查询单条数据
     *
     * @param blogId 主键
     * @return 实例对象
     */
    @Override
    public ThumbsUp queryById(Long blogId) {
        return this.thumbsUpDao.queryById(blogId);
    }

    

    /**
     * 新增数据
     *
     * @param thumbsUp 实例对象
     * @return 实例对象
     */
    @Override
    public ThumbsUp insert(ThumbsUp thumbsUp) {
        this.thumbsUpDao.insert(thumbsUp);
        return thumbsUp;
    }

    /**
     * 修改数据
     *
     * @param thumbsUp 实例对象
     * @return 实例对象
     */
    @Override
    public ThumbsUp update(ThumbsUp thumbsUp) {
        this.thumbsUpDao.update(thumbsUp);
        return this.queryById(thumbsUp.getBlogId());
    }

    /**
     * 通过主键删除数据
     *
     * @param blogId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long blogId) {
        return this.thumbsUpDao.deleteById(blogId) > 0;
    }
}
