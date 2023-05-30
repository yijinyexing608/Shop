package com.etc.blogtest.controller;

import com.etc.blogtest.entity.Friends;
import com.etc.blogtest.service.FriendsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Friends)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("friends")
public class FriendsController {
    /**
     * 服务对象
     */
    @Resource
    private FriendsService friendsService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Friends> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.friendsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param friends 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Friends> add(Friends friends) {
        return ResponseEntity.ok(this.friendsService.insert(friends));
    }

    /**
     * 编辑数据
     *
     * @param friends 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Friends> edit(Friends friends) {
        return ResponseEntity.ok(this.friendsService.update(friends));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.friendsService.deleteById(id));
    }

}

