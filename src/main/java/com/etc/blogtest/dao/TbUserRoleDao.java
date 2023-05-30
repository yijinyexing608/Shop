package com.etc.blogtest.dao;

import com.etc.blogtest.entity.TbUserRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbUserRole)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbUserRoleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbUserRole queryById(Integer id);

    
    /**
     * 统计总行数
     *
     * @param tbUserRole 查询条件
     * @return 总行数
     */
    long count(TbUserRole tbUserRole);

    /**
     * 新增数据
     *
     * @param tbUserRole 实例对象
     * @return 影响行数
     */
    int insert(TbUserRole tbUserRole);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbUserRole> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbUserRole> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbUserRole> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbUserRole> entities);

    /**
     * 修改数据
     *
     * @param tbUserRole 实例对象
     * @return 影响行数
     */
    int update(TbUserRole tbUserRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

