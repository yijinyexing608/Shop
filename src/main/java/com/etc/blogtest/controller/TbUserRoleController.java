package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbUserRole;
import com.etc.blogtest.service.TbUserRoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbUserRole)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("tbUserRole")
public class TbUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TbUserRoleService tbUserRoleService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbUserRole> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbUserRoleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbUserRole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbUserRole> add(TbUserRole tbUserRole) {
        return ResponseEntity.ok(this.tbUserRoleService.insert(tbUserRole));
    }

    /**
     * 编辑数据
     *
     * @param tbUserRole 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbUserRole> edit(TbUserRole tbUserRole) {
        return ResponseEntity.ok(this.tbUserRoleService.update(tbUserRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbUserRoleService.deleteById(id));
    }

}

