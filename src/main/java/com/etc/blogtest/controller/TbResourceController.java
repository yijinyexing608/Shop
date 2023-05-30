package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbResource;
import com.etc.blogtest.service.TbResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbResource)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("tbResource")
public class TbResourceController {
    /**
     * 服务对象
     */
    @Resource
    private TbResourceService tbResourceService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbResource> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tbResourceService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbResource 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbResource> add(TbResource tbResource) {
        return ResponseEntity.ok(this.tbResourceService.insert(tbResource));
    }

    /**
     * 编辑数据
     *
     * @param tbResource 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbResource> edit(TbResource tbResource) {
        return ResponseEntity.ok(this.tbResourceService.update(tbResource));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tbResourceService.deleteById(id));
    }

}

