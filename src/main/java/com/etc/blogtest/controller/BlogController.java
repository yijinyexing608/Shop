package com.etc.blogtest.controller;

import com.etc.blogtest.entity.Blog;
import com.etc.blogtest.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Blog)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("blog")
public class BlogController {
    /**
     * 服务对象
     */
    @Resource
    private BlogService blogService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Blog> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.blogService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param blog 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Blog> add(Blog blog) {
        return ResponseEntity.ok(this.blogService.insert(blog));
    }

    /**
     * 编辑数据
     *
     * @param blog 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Blog> edit(Blog blog) {
        return ResponseEntity.ok(this.blogService.update(blog));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.blogService.deleteById(id));
    }

}

