package com.etc.blogtest.controller;

import com.etc.blogtest.entity.Views;
import com.etc.blogtest.service.ViewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Views)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("views")
public class ViewsController {
    /**
     * 服务对象
     */
    @Resource
    private ViewsService viewsService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Views> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.viewsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param views 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Views> add(Views views) {
        return ResponseEntity.ok(this.viewsService.insert(views));
    }

    /**
     * 编辑数据
     *
     * @param views 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Views> edit(Views views) {
        return ResponseEntity.ok(this.viewsService.update(views));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.viewsService.deleteById(id));
    }

}

