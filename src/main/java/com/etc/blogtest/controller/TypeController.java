package com.etc.blogtest.controller;

import com.etc.blogtest.entity.Type;
import com.etc.blogtest.service.TypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Type)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("type")
public class TypeController {
    /**
     * 服务对象
     */
    @Resource
    private TypeService typeService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Type> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.typeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param type 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Type> add(Type type) {
        return ResponseEntity.ok(this.typeService.insert(type));
    }

    /**
     * 编辑数据
     *
     * @param type 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Type> edit(Type type) {
        return ResponseEntity.ok(this.typeService.update(type));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.typeService.deleteById(id));
    }

}

