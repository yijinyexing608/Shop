package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.GroupChat;
import com.etc.blogtest.dao.GroupChatDao;
import com.etc.blogtest.service.GroupChatService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (GroupChat)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("groupChatService")
public class GroupChatServiceImpl implements GroupChatService {
    @Resource
    private GroupChatDao groupChatDao;

    /**
     * 通过ID查询单条数据
     *
     * @param msgId 主键
     * @return 实例对象
     */
    @Override
    public GroupChat queryById(Long msgId) {
        return this.groupChatDao.queryById(msgId);
    }

    

    /**
     * 新增数据
     *
     * @param groupChat 实例对象
     * @return 实例对象
     */
    @Override
    public GroupChat insert(GroupChat groupChat) {
        this.groupChatDao.insert(groupChat);
        return groupChat;
    }

    /**
     * 修改数据
     *
     * @param groupChat 实例对象
     * @return 实例对象
     */
    @Override
    public GroupChat update(GroupChat groupChat) {
        this.groupChatDao.update(groupChat);
        return this.queryById(groupChat.getMsgId());
    }

    /**
     * 通过主键删除数据
     *
     * @param msgId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long msgId) {
        return this.groupChatDao.deleteById(msgId) > 0;
    }
}
