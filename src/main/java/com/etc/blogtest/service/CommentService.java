package com.etc.blogtest.service;

import com.etc.blogtest.entity.Comment;

import java.util.List;
import java.util.Map;


/**
 * (Comment)表服务接口
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface CommentService {
    List<Comment> list(Map<String,Object> map);
    List<Map<String,Object>> listAll(Map<String,Object> map);
    /**
     * 通过ID查询单条数据
     *
     * @param commentId 主键
     * @return 实例对象
     */
    Comment queryById(Long commentId);

   
    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    int insert(Comment comment);

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    int update(Comment comment);

    /**
     * 通过主键删除数据
     *
     * @param commentId 主键
     * @return 是否成功
     */
    int deleteById(Long commentId);

}
