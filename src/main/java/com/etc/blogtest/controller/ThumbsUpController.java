package com.etc.blogtest.controller;

import com.etc.blogtest.entity.ThumbsUp;
import com.etc.blogtest.service.ThumbsUpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ThumbsUp)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("thumbsUp")
public class ThumbsUpController {
    /**
     * 服务对象
     */
    @Resource
    private ThumbsUpService thumbsUpService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ThumbsUp> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.thumbsUpService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param thumbsUp 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ThumbsUp> add(ThumbsUp thumbsUp) {
        return ResponseEntity.ok(this.thumbsUpService.insert(thumbsUp));
    }

    /**
     * 编辑数据
     *
     * @param thumbsUp 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ThumbsUp> edit(ThumbsUp thumbsUp) {
        return ResponseEntity.ok(this.thumbsUpService.update(thumbsUp));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.thumbsUpService.deleteById(id));
    }

}

