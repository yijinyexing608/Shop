package com.etc.blogtest.controller;

import com.etc.blogtest.common.ResultBody;
import com.etc.blogtest.entity.Comment;
import com.etc.blogtest.entity.Message;
import com.etc.blogtest.jwt.Token;
import com.etc.blogtest.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Comment)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;

    @GetMapping("/list")
    @Token
    public ResultBody list(@RequestParam Map<String,Object> params) {
        Integer currPage=1;
        Integer pageSize=5;
        try{
            currPage = Integer.valueOf(params.get("currPage").toString());
        }catch (Exception e){
        }
        try{
            pageSize = Integer.valueOf(params.get("pageSize").toString());
        }catch (Exception e){
        }
        PageHelper.startPage(currPage,pageSize);
        List<Comment> comments = commentService.list(params);
        PageInfo info = new PageInfo(comments);
        return ResultBody.success(info) ;
    }

/**
 *
 */
@RequestMapping("/listAll")
public ResultBody listAll(@RequestParam Map<String,Object> params) {
    Integer currPage=1;
    Integer pageSize=5;
    try{
        currPage = Integer.valueOf(params.get("currPage").toString());
    }catch (Exception e){
    }
    try{
        pageSize = Integer.valueOf(params.get("pageSize").toString());
    }catch (Exception e){
    }
    PageHelper.startPage(currPage,pageSize);
    List<Map<String, Object>> list = commentService.listAll(params);
    PageInfo info = new PageInfo(list);
    return ResultBody.success(info) ;
}


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Comment> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.commentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param comment 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResultBody add(Comment comment) {
        int i = commentService.insert(comment);
        if(i!=-1){
            return ResultBody.success("添加成功");
        }
        return ResultBody.error("添加失败");
    }

    /**
     * 编辑数据
     *
     * @param comment 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public ResultBody edit(Comment comment) {
        if (commentService.update(comment)>0){
            return ResultBody.success("更新成功");
        }
return ResultBody.error("更新失败");
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("/del/{commentId}")
    public ResultBody deleteById(@PathVariable("commentId") Long id) {
        int i = this.commentService.deleteById(id);
        if(i>0)
        return ResultBody.success("删除成功");
return ResultBody.error("删除失败");
    }

}

