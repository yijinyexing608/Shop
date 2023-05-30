package com.etc.blogtest.dao;

import com.etc.blogtest.entity.TbOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbOrder)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
public interface TbOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param payId 主键
     * @return 实例对象
     */
    TbOrder queryById(String payId);

    
    /**
     * 统计总行数
     *
     * @param tbOrder 查询条件
     * @return 总行数
     */
    long count(TbOrder tbOrder);

    /**
     * 新增数据
     *
     * @param tbOrder 实例对象
     * @return 影响行数
     */
    int insert(TbOrder tbOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbOrder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbOrder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbOrder> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbOrder> entities);

    /**
     * 修改数据
     *
     * @param tbOrder 实例对象
     * @return 影响行数
     */
    int update(TbOrder tbOrder);

    /**
     * 通过主键删除数据
     *
     * @param payId 主键
     * @return 影响行数
     */
    int deleteById(String payId);

}

