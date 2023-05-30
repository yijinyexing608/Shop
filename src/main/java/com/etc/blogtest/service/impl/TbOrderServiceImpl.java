package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.TbOrder;
import com.etc.blogtest.dao.TbOrderDao;
import com.etc.blogtest.service.TbOrderService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (TbOrder)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@Service("tbOrderService")
public class TbOrderServiceImpl implements TbOrderService {
    @Resource
    private TbOrderDao tbOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param payId 主键
     * @return 实例对象
     */
    @Override
    public TbOrder queryById(String payId) {
        return this.tbOrderDao.queryById(payId);
    }

    

    /**
     * 新增数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrder insert(TbOrder tbOrder) {
        this.tbOrderDao.insert(tbOrder);
        return tbOrder;
    }

    /**
     * 修改数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrder update(TbOrder tbOrder) {
        this.tbOrderDao.update(tbOrder);
        return this.queryById(tbOrder.getPayId());
    }

    /**
     * 通过主键删除数据
     *
     * @param payId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String payId) {
        return this.tbOrderDao.deleteById(payId) > 0;
    }
}
