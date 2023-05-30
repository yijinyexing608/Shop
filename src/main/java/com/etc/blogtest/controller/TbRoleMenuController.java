package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbRoleMenu;
import com.etc.blogtest.service.TbRoleMenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbRoleMenu)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("tbRoleMenu")
public class TbRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private TbRoleMenuService tbRoleMenuService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbRoleMenu> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbRoleMenuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbRoleMenu 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbRoleMenu> add(TbRoleMenu tbRoleMenu) {
        return ResponseEntity.ok(this.tbRoleMenuService.insert(tbRoleMenu));
    }

    /**
     * 编辑数据
     *
     * @param tbRoleMenu 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbRoleMenu> edit(TbRoleMenu tbRoleMenu) {
        return ResponseEntity.ok(this.tbRoleMenuService.update(tbRoleMenu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbRoleMenuService.deleteById(id));
    }

}

