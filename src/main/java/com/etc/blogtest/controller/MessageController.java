package com.etc.blogtest.controller;

import com.etc.blogtest.common.ResultBody;
import com.etc.blogtest.entity.Message;
import com.etc.blogtest.service.MessageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Message)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:23
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    /**
     * 服务对象
     */
    @Resource
    private MessageService messageService;

   

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Message> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.messageService.queryById(id));
    }

    /**
     * 分页查询
     * @param params
     * @return
     */
    @GetMapping("/list")
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
        List<Message> messages = messageService.list(params);
        PageInfo info = new PageInfo(messages);
        return ResultBody.success(info) ;
    }

    @PostMapping("/listAll")
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
        List<Message> messages = messageService.list(params);
        PageInfo info = new PageInfo(messages);


        return ResultBody.success(info) ;
    }

    /**
     * 新增数据
     *
     * @param message 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResultBody add(Message message) {
        int i = messageService.insert(message);
if (i!=-1){
    return ResultBody.success("suceess");
}else
    return ResultBody.error();

    }

    /**
     * 编辑数据
     *
     * @param message 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public ResultBody edit(Message message) {
        if(this.messageService.update(message)!=-1)
        return ResultBody.success("更新成功");
        return ResultBody.error("更新失败");
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("/del/{mid}")
    public ResultBody deleteById(@PathVariable("mid") Long id) {
        int i = this.messageService.deleteById(id);
        if(i!=-1)
        return ResultBody.success("删除成功");
        return ResultBody.error("删除失败");
    }

}

