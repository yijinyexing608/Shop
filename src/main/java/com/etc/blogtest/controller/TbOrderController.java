package com.etc.blogtest.controller;

import com.etc.blogtest.entity.TbOrder;
import com.etc.blogtest.service.TbOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbOrder)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("tbOrder")
public class TbOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderService tbOrderService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<TbOrder> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.tbOrderService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tbOrder 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<TbOrder> add(TbOrder tbOrder) {
        return ResponseEntity.ok(this.tbOrderService.insert(tbOrder));
    }

    /**
     * 编辑数据
     *
     * @param tbOrder 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<TbOrder> edit(TbOrder tbOrder) {
        return ResponseEntity.ok(this.tbOrderService.update(tbOrder));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.tbOrderService.deleteById(id));
    }

}

