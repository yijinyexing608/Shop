package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.Message;
import com.etc.blogtest.dao.MessageDao;
import com.etc.blogtest.service.MessageService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Message)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {
    @Resource
    private MessageDao messageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    @Override
    public Message queryById(Long mid) {
        return this.messageDao.queryById(mid);
    }

    @Override
    public List<Map<String, Object>> listAll(Map<String, Object> map) {
        return messageDao.listAll(map);
    }

    @Override
    public List<Message> list(Map<String, Object> map) {
        return messageDao.list(map);
    }


    /**
     * 新增数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Message message) {

        return this.messageDao.insert(message);
    }

    /**
     * 修改数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Message message) {

        return this.messageDao.update(message) ;
    }

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Long mid) {
        return this.messageDao.deleteById(mid) ;
    }
}
