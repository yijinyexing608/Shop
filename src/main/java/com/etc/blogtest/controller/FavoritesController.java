package com.etc.blogtest.controller;

import com.etc.blogtest.entity.Favorites;
import com.etc.blogtest.service.FavoritesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Favorites)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("favorites")
public class FavoritesController {
    /**
     * 服务对象
     */
    @Resource
    private FavoritesService favoritesService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Favorites> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.favoritesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param favorites 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Favorites> add(Favorites favorites) {
        return ResponseEntity.ok(this.favoritesService.insert(favorites));
    }

    /**
     * 编辑数据
     *
     * @param favorites 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Favorites> edit(Favorites favorites) {
        return ResponseEntity.ok(this.favoritesService.update(favorites));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.favoritesService.deleteById(id));
    }

}

