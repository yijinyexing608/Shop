package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbOperationLog;
import com.etc.blogtest.service.TbOperationLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbOperationLog)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("tbOperationLog")
public class TbOperationLogController {
    /**
     * 服务对象
     */
    @Resource
    private TbOperationLogService tbOperationLogService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbOperationLog> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbOperationLogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbOperationLog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbOperationLog> add(TbOperationLog tbOperationLog) {
        return ResponseEntity.ok(this.tbOperationLogService.insert(tbOperationLog));
    }

    /**
     * 编辑数据
     *
     * @param tbOperationLog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbOperationLog> edit(TbOperationLog tbOperationLog) {
        return ResponseEntity.ok(this.tbOperationLogService.update(tbOperationLog));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbOperationLogService.deleteById(id));
    }

}

