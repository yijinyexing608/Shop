package com.etc.blogtest.service;

import com.etc.blogtest.entity.GroupChat;


/**
 * (GroupChat)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface GroupChatService {

    /**
     * 通过ID查询单条数据
     *
     * @param msgId 主键
     * @return 实例对象
     */
    GroupChat queryById(Long msgId);

   
    /**
     * 新增数据
     *
     * @param groupChat 实例对象
     * @return 实例对象
     */
    GroupChat insert(GroupChat groupChat);

    /**
     * 修改数据
     *
     * @param groupChat 实例对象
     * @return 实例对象
     */
    GroupChat update(GroupChat groupChat);

    /**
     * 通过主键删除数据
     *
     * @param msgId 主键
     * @return 是否成功
     */
    boolean deleteById(Long msgId);

}
