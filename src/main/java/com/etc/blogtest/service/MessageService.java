package com.etc.blogtest.service;

import com.etc.blogtest.entity.Message;

import java.util.List;
import java.util.Map;


/**
 * (Message)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface MessageService {

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    Message queryById(Long mid);
    /**
     * 分页查询用户留言相关
     */
    List<Map<String,Object>> listAll( Map<String,Object> map);
    /**
     * 分页查询
     */
    List<Message> list(Map<String,Object> map);

    /**
     * 新增数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
    int insert(Message message);

    /**
     * 修改数据
     *
     * @param message 实例对象
     * @return 实例对象
     */
   int update(Message message);

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 是否成功
     */
   int deleteById(Long mid);

}
