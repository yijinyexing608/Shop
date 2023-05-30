package com.etc.blogtest.dao;

import com.etc.blogtest.entity.Views;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Views)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface ViewsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Views queryById(Long id);

    
    /**
     * 统计总行数
     *
     * @param views 查询条件
     * @return 总行数
     */
    long count(Views views);

    /**
     * 新增数据
     *
     * @param views 实例对象
     * @return 影响行数
     */
    int insert(Views views);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Views> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Views> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Views> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Views> entities);

    /**
     * 修改数据
     *
     * @param views 实例对象
     * @return 影响行数
     */
    int update(Views views);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

