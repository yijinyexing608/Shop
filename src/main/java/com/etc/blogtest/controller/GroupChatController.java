package com.etc.blogtest.controller;

import com.etc.blogtest.entity.GroupChat;
import com.etc.blogtest.service.GroupChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (GroupChat)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("groupChat")
public class GroupChatController {
    /**
     * 服务对象
     */
    @Resource
    private GroupChatService groupChatService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<GroupChat> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.groupChatService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param groupChat 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<GroupChat> add(GroupChat groupChat) {
        return ResponseEntity.ok(this.groupChatService.insert(groupChat));
    }

    /**
     * 编辑数据
     *
     * @param groupChat 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<GroupChat> edit(GroupChat groupChat) {
        return ResponseEntity.ok(this.groupChatService.update(groupChat));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.groupChatService.deleteById(id));
    }

}

