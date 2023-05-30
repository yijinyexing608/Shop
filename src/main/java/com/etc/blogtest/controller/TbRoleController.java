package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbRole;
import com.etc.blogtest.service.TbRoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbRole)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("tbRole")
public class TbRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TbRoleService tbRoleService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbRole> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbRole> add(TbRole tbRole) {
        return ResponseEntity.ok(this.tbRoleService.insert(tbRole));
    }

    /**
     * 编辑数据
     *
     * @param tbRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbRole> edit(TbRole tbRole) {
        return ResponseEntity.ok(this.tbRoleService.update(tbRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbRoleService.deleteById(id));
    }

}

