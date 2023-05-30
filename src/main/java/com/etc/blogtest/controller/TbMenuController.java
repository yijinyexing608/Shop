package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbMenu;
import com.etc.blogtest.service.TbMenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbMenu)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("tbMenu")
public class TbMenuController {
    /**
     * 服务对象
     */
    @Resource
    private TbMenuService tbMenuService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbMenu> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbMenuService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbMenu 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbMenu> add(TbMenu tbMenu) {
        return ResponseEntity.ok(this.tbMenuService.insert(tbMenu));
    }

    /**
     * 编辑数据
     *
     * @param tbMenu 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbMenu> edit(TbMenu tbMenu) {
        return ResponseEntity.ok(this.tbMenuService.update(tbMenu));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbMenuService.deleteById(id));
    }

}

