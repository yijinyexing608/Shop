package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbRole;
import com.etc.blogtest.dao.TbRoleDao;
import com.etc.blogtest.service.TbRoleService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbRole)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("tbRoleService")
public class TbRoleServiceImpl implements TbRoleService {
    @Resource
    private TbRoleDao tbRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    @Override
    public TbRole queryById(Integer rid) {
        return this.tbRoleDao.queryById(rid);
    }

    

    /**
     * 新增数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbRole insert(TbRole tbRole) {
        this.tbRoleDao.insert(tbRole);
        return tbRole;
    }

    /**
     * 修改数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    @Override
    public TbRole update(TbRole tbRole) {
        this.tbRoleDao.update(tbRole);
        return this.queryById(tbRole.getRid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rid) {
        return this.tbRoleDao.deleteById(rid) > 0;
    }
}
