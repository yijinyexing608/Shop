package com.etc.blogtest.controller;

import com.etc.blogtest.common.ResultBody;
import com.etc.blogtest.entity.User;
import com.etc.blogtest.jwt.JWTUtils;
import com.etc.blogtest.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-10-23 22:29:24
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;
@RequestMapping("/login")
   public ResultBody login(@RequestParam Map<String,Object> params){
//       String username = params.get("username").toString();
//       String password=params.get("password").toString();
       User user = userService.login(params);
       if(user==null){
return ResultBody.error("用户名密码不匹配");
       }
       Map<String,Object> result = new HashMap<>();
       result.put("token", JWTUtils.sign(user.getUid()));
       result.put("username",user.getUsername());

       return ResultBody.success(result);

   }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<User> add(User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }

    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<User> edit(User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.userService.deleteById(id));
    }

}

