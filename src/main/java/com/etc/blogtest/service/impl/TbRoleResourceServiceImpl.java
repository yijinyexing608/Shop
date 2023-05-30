package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbRoleResource;
import com.etc.blogtest.dao.TbRoleResourceDao;
import com.etc.blogtest.service.TbRoleResourceService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbRoleResource)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("tbRoleResourceService")
public class TbRoleResourceServiceImpl implements TbRoleResourceService {
    @Resource
    private TbRoleResourceDao tbRoleResourceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbRoleResource queryById(Integer id) {
        return this.tbRoleResourceDao.queryById(id);
    }

    

    /**
     * 新增数据
     *
     * @param tbRoleResource 实例对象
     * @return 实例对象
     */
    @Override
    public TbRoleResource insert(TbRoleResource tbRoleResource) {
        this.tbRoleResourceDao.insert(tbRoleResource);
        return tbRoleResource;
    }

    /**
     * 修改数据
     *
     * @param tbRoleResource 实例对象
     * @return 实例对象
     */
    @Override
    public TbRoleResource update(TbRoleResource tbRoleResource) {
        this.tbRoleResourceDao.update(tbRoleResource);
        return this.queryById(tbRoleResource.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbRoleResourceDao.deleteById(id) > 0;
    }
}
