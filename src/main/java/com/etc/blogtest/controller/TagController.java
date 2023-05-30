package com.etc.blogtest.controller;

import com.etc.blogtest.entity.Tag;
import com.etc.blogtest.service.TagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Tag)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("tag")
public class TagController {
    /**
     * 服务对象
     */
    @Resource
    private TagService tagService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Tag> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tagService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tag 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Tag> add(Tag tag) {
        return ResponseEntity.ok(this.tagService.insert(tag));
    }

    /**
     * 编辑数据
     *
     * @param tag 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Tag> edit(Tag tag) {
        return ResponseEntity.ok(this.tagService.update(tag));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tagService.deleteById(id));
    }

}

