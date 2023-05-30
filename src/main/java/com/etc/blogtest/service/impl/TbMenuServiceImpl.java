package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbMenu;
import com.etc.blogtest.dao.TbMenuDao;
import com.etc.blogtest.service.TbMenuService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbMenu)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("tbMenuService")
public class TbMenuServiceImpl implements TbMenuService {
    @Resource
    private TbMenuDao tbMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbMenu queryById(Integer id) {
        return this.tbMenuDao.queryById(id);
    }

    

    /**
     * 新增数据
     *
     * @param tbMenu 实例对象
     * @return 实例对象
     */
    @Override
    public TbMenu insert(TbMenu tbMenu) {
        this.tbMenuDao.insert(tbMenu);
        return tbMenu;
    }

    /**
     * 修改数据
     *
     * @param tbMenu 实例对象
     * @return 实例对象
     */
    @Override
    public TbMenu update(TbMenu tbMenu) {
        this.tbMenuDao.update(tbMenu);
        return this.queryById(tbMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbMenuDao.deleteById(id) > 0;
    }
}
