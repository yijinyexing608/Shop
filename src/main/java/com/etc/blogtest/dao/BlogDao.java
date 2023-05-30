package com.etc.blogtest.dao;

import com.etc.blogtest.entity.Blog;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Blog)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */

public interface BlogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param blogId 主键
     * @return 实例对象
     */
    Blog queryById(Long blogId);

    
    /**
     * 统计总行数
     *
     * @param blog 查询条件
     * @return 总行数
     */
    long count(Blog blog);

    /**
     * 新增数据
     *
     * @param blog 实例对象
     * @return 影响行数
     */
    int insert(Blog blog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Blog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Blog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Blog> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Blog> entities);

    /**
     * 修改数据
     *
     * @param blog 实例对象
     * @return 影响行数
     */
    int update(Blog blog);

    /**
     * 通过主键删除数据
     *
     * @param blogId 主键
     * @return 影响行数
     */
    int deleteById(Long blogId);

}

