package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbResource;
import com.etc.blogtest.dao.TbResourceDao;
import com.etc.blogtest.service.TbResourceService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbResource)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("tbResourceService")
public class TbResourceServiceImpl implements TbResourceService {
    @Resource
    private TbResourceDao tbResourceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbResource queryById(Integer id) {
        return this.tbResourceDao.queryById(id);
    }

    

    /**
     * 新增数据
     *
     * @param tbResource 实例对象
     * @return 实例对象
     */
    @Override
    public TbResource insert(TbResource tbResource) {
        this.tbResourceDao.insert(tbResource);
        return tbResource;
    }

    /**
     * 修改数据
     *
     * @param tbResource 实例对象
     * @return 实例对象
     */
    @Override
    public TbResource update(TbResource tbResource) {
        this.tbResourceDao.update(tbResource);
        return this.queryById(tbResource.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbResourceDao.deleteById(id) > 0;
    }
}
