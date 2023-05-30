package com.etc.blogtest.service.impl;

import com.etc.blogtest.entity.Comment;
import com.etc.blogtest.dao.CommentDao;
import com.etc.blogtest.service.CommentService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Comment)表服务实现类
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {


    @Resource
    private CommentDao commentDao;

    @Override
    public List<Comment> list(Map<String, Object> map) {

        return commentDao.list(map);
    }

    @Override
    public List<Map<String, Object>> listAll(Map<String, Object> map) {
        return commentDao.listAll(map);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param commentId 主键
     * @return 实例对象
     */
    @Override
    public Comment queryById(Long commentId) {
        return this.commentDao.queryById(commentId);
    }

    

    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Comment comment) {

        return this.commentDao.insert(comment);
    }

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Comment comment) {

        return  this.commentDao.update(comment);
    }

    /**
     * 通过主键删除数据
     *
     * @param commentId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Long commentId) {
        return this.commentDao.deleteById(commentId) ;
    }
}
