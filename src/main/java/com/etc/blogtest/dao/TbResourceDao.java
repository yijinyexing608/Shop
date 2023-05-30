package com.etc.blogtest.dao;

import com.etc.blogtest.entity.TbResource;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbResource)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbResourceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbResource queryById(Integer id);

    
    /**
     * 统计总行数
     *
     * @param tbResource 查询条件
     * @return 总行数
     */
    long count(TbResource tbResource);

    /**
     * 新增数据
     *
     * @param tbResource 实例对象
     * @return 影响行数
     */
    int insert(TbResource tbResource);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbResource> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbResource> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbResource> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbResource> entities);

    /**
     * 修改数据
     *
     * @param tbResource 实例对象
     * @return 影响行数
     */
    int update(TbResource tbResource);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

