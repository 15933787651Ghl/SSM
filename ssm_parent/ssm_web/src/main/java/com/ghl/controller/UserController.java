package com.ghl.controller;

import com.ghl.pojo.User;
import com.ghl.service.UserService;
import com.ghl.util.Result;
import com.ghl.vo.UserVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/findAllUserByPage")
    public Result findAllUserByPage(@RequestBody UserVo userVo){

        PageInfo pageInfo=userService.findAll(userVo);


        return new Result(true,"分页查看成功",pageInfo,200);


    }
    @GetMapping("/updateUserStatus")
    public Result updateUserStatus(User user){

         userService.update(user);

         return new Result(true,"成功修改",user.getStatus(),200);
    }
}
