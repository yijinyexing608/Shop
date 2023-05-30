package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.Type;
import com.etc.blogtest.dao.TypeDao;
import com.etc.blogtest.service.TypeService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Type)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    @Override
    public Type queryById(Integer typeId) {
        return this.typeDao.queryById(typeId);
    }

    

    /**
     * 新增数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type insert(Type type) {
        this.typeDao.insert(type);
        return type;
    }

    /**
     * 修改数据
     *
     * @param type 实例对象
     * @return 实例对象
     */
    @Override
    public Type update(Type type) {
        this.typeDao.update(type);
        return this.queryById(type.getTypeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer typeId) {
        return this.typeDao.deleteById(typeId) > 0;
    }
}
