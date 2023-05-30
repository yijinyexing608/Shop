package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbUserRole;
import com.etc.blogtest.dao.TbUserRoleDao;
import com.etc.blogtest.service.TbUserRoleService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbUserRole)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("tbUserRoleService")
public class TbUserRoleServiceImpl implements TbUserRoleService {
    @Resource
    private TbUserRoleDao tbUserRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbUserRole queryById(Integer id) {
        return this.tbUserRoleDao.queryById(id);
    }

    

    /**
     * 新增数据
     *
     * @param tbUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserRole insert(TbUserRole tbUserRole) {
        this.tbUserRoleDao.insert(tbUserRole);
        return tbUserRole;
    }

    /**
     * 修改数据
     *
     * @param tbUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserRole update(TbUserRole tbUserRole) {
        this.tbUserRoleDao.update(tbUserRole);
        return this.queryById(tbUserRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbUserRoleDao.deleteById(id) > 0;
    }
}
