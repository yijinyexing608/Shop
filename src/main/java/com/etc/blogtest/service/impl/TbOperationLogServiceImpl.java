package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbOperationLog;
import com.etc.blogtest.dao.TbOperationLogDao;
import com.etc.blogtest.service.TbOperationLogService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbOperationLog)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("tbOperationLogService")
public class TbOperationLogServiceImpl implements TbOperationLogService {
    @Resource
    private TbOperationLogDao tbOperationLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbOperationLog queryById(Integer id) {
        return this.tbOperationLogDao.queryById(id);
    }

    

    /**
     * 新增数据
     *
     * @param tbOperationLog 实例对象
     * @return 实例对象
     */
    @Override
    public TbOperationLog insert(TbOperationLog tbOperationLog) {
        this.tbOperationLogDao.insert(tbOperationLog);
        return tbOperationLog;
    }

    /**
     * 修改数据
     *
     * @param tbOperationLog 实例对象
     * @return 实例对象
     */
    @Override
    public TbOperationLog update(TbOperationLog tbOperationLog) {
        this.tbOperationLogDao.update(tbOperationLog);
        return this.queryById(tbOperationLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbOperationLogDao.deleteById(id) > 0;
    }
}
