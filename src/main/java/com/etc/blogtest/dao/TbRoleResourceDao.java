package com.etc.blogtest.dao;

import com.etc.blogtest.entity.TbRoleResource;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbRoleResource)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbRoleResourceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbRoleResource queryById(Integer id);

    
    /**
     * 统计总行数
     *
     * @param tbRoleResource 查询条件
     * @return 总行数
     */
    long count(TbRoleResource tbRoleResource);

    /**
     * 新增数据
     *
     * @param tbRoleResource 实例对象
     * @return 影响行数
     */
    int insert(TbRoleResource tbRoleResource);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbRoleResource> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbRoleResource> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbRoleResource> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbRoleResource> entities);

    /**
     * 修改数据
     *
     * @param tbRoleResource 实例对象
     * @return 影响行数
     */
    int update(TbRoleResource tbRoleResource);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

