package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.Link;
import com.etc.blogtest.dao.LinkDao;
import com.etc.blogtest.service.LinkService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Link)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService {
    @Resource
    private LinkDao linkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param linkId 主键
     * @return 实例对象
     */
    @Override
    public Link queryById(Long linkId) {
        return this.linkDao.queryById(linkId);
    }

    

    /**
     * 新增数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    @Override
    public Link insert(Link link) {
        this.linkDao.insert(link);
        return link;
    }

    /**
     * 修改数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    @Override
    public Link update(Link link) {
        this.linkDao.update(link);
        return this.queryById(link.getLinkId());
    }

    /**
     * 通过主键删除数据
     *
     * @param linkId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long linkId) {
        return this.linkDao.deleteById(linkId) > 0;
    }
}
