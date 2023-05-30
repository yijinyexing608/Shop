package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.Views;
import com.etc.blogtest.dao.ViewsDao;
import com.etc.blogtest.service.ViewsService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Views)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("viewsService")
public class ViewsServiceImpl implements ViewsService {
    @Resource
    private ViewsDao viewsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Views queryById(Long id) {
        return this.viewsDao.queryById(id);
    }

    

    /**
     * 新增数据
     *
     * @param views 实例对象
     * @return 实例对象
     */
    @Override
    public Views insert(Views views) {
        this.viewsDao.insert(views);
        return views;
    }

    /**
     * 修改数据
     *
     * @param views 实例对象
     * @return 实例对象
     */
    @Override
    public Views update(Views views) {
        this.viewsDao.update(views);
        return this.queryById(views.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.viewsDao.deleteById(id) > 0;
    }
}
