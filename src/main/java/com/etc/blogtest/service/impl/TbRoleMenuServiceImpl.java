package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbRoleMenu;
import com.etc.blogtest.dao.TbRoleMenuDao;
import com.etc.blogtest.service.TbRoleMenuService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbRoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("tbRoleMenuService")
public class TbRoleMenuServiceImpl implements TbRoleMenuService {
    @Resource
    private TbRoleMenuDao tbRoleMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbRoleMenu queryById(Integer id) {
        return this.tbRoleMenuDao.queryById(id);
    }

    

    /**
     * 新增数据
     *
     * @param tbRoleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public TbRoleMenu insert(TbRoleMenu tbRoleMenu) {
        this.tbRoleMenuDao.insert(tbRoleMenu);
        return tbRoleMenu;
    }

    /**
     * 修改数据
     *
     * @param tbRoleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public TbRoleMenu update(TbRoleMenu tbRoleMenu) {
        this.tbRoleMenuDao.update(tbRoleMenu);
        return this.queryById(tbRoleMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbRoleMenuDao.deleteById(id) > 0;
    }
}
