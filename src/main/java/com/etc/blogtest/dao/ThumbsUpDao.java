package com.etc.blogtest.dao;

import com.etc.blogtest.entity.ThumbsUp;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ThumbsUp)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface ThumbsUpDao {

    /**
     * 通过ID查询单条数据
     *
     * @param blogId 主键
     * @return 实例对象
     */
    ThumbsUp queryById(Long blogId);

    
    /**
     * 统计总行数
     *
     * @param thumbsUp 查询条件
     * @return 总行数
     */
    long count(ThumbsUp thumbsUp);

    /**
     * 新增数据
     *
     * @param thumbsUp 实例对象
     * @return 影响行数
     */
    int insert(ThumbsUp thumbsUp);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ThumbsUp> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ThumbsUp> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ThumbsUp> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ThumbsUp> entities);

    /**
     * 修改数据
     *
     * @param thumbsUp 实例对象
     * @return 影响行数
     */
    int update(ThumbsUp thumbsUp);

    /**
     * 通过主键删除数据
     *
     * @param blogId 主键
     * @return 影响行数
     */
    int deleteById(Long blogId);

}

