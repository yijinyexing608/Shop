package com.etc.blogtest.dao;

import com.etc.blogtest.entity.Message;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (Message)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface MessageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    Message queryById(Long mid);

    /**
     * 分页查询
     * @param map
     * @return list集合
     */
    List<Message> list( Map<String,Object> map);

    /**
     * 查用户留言内容相关
     * @param map
     * @return
     */
    List<Map<String,Object>> listAll( Map<String,Object> map);
    /**
     * 统计总行数
     *
     * @param message 查询条件
     * @return 总行数
     */
    long count(Message message);

    /**
     * 新增数据
     *
     * @param message 实例对象
     * @return 影响行数
     */
    int insert(Message message);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Message> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Message> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Message> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Message> entities);

    /**
     * 修改数据
     *
     * @param message 实例对象
     * @return 影响行数
     */
    int update(Message message);

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 影响行数
     */
    int deleteById(Long mid);

}

