package com.etc.blogtest.controller;

import com.etc.blogtest.entity.Link;
import com.etc.blogtest.service.LinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Link)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("link")
public class LinkController {
    /**
     * 服务对象
     */
    @Resource
    private LinkService linkService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Link> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.linkService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param link 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Link> add(Link link) {
        return ResponseEntity.ok(this.linkService.insert(link));
    }

    /**
     * 编辑数据
     *
     * @param link 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Link> edit(Link link) {
        return ResponseEntity.ok(this.linkService.update(link));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.linkService.deleteById(id));
    }

}

