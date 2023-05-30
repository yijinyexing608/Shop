package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbRoleResource;
import com.etc.blogtest.service.TbRoleResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbRoleResource)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("tbRoleResource")
public class TbRoleResourceController {
    /**
     * 服务对象
     */
    @Resource
    private TbRoleResourceService tbRoleResourceService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbRoleResource> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbRoleResourceService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbRoleResource 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbRoleResource> add(TbRoleResource tbRoleResource) {
        return ResponseEntity.ok(this.tbRoleResourceService.insert(tbRoleResource));
    }

    /**
     * 编辑数据
     *
     * @param tbRoleResource 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbRoleResource> edit(TbRoleResource tbRoleResource) {
        return ResponseEntity.ok(this.tbRoleResourceService.update(tbRoleResource));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbRoleResourceService.deleteById(id));
    }

}

