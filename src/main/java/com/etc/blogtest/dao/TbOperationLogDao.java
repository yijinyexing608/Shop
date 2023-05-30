package com.etc.blogtest.dao;

import com.etc.blogtest.entity.TbOperationLog;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbOperationLog)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
public interface TbOperationLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbOperationLog queryById(Integer id);

    
    /**
     * 统计总行数
     *
     * @param tbOperationLog 查询条件
     * @return 总行数
     */
    long count(TbOperationLog tbOperationLog);

    /**
     * 新增数据
     *
     * @param tbOperationLog 实例对象
     * @return 影响行数
     */
    int insert(TbOperationLog tbOperationLog);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbOperationLog> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbOperationLog> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbOperationLog> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbOperationLog> entities);

    /**
     * 修改数据
     *
     * @param tbOperationLog 实例对象
     * @return 影响行数
     */
    int update(TbOperationLog tbOperationLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

