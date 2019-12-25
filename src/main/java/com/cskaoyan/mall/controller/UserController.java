package com.cskaoyan.mall.controller;

import com.cskaoyan.mall.bean.BaseReqVo;
import com.cskaoyan.mall.bean.User;
import com.cskaoyan.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("list")
    public BaseReqVo list(Integer page,Integer limit){
        List<User> users = userService.queryUsers(page, limit);
        int i = 0;
        BaseReqVo<List<User>> listBaseReqVo = new BaseReqVo<>();
        System.out.println("hello xiaowang");
        listBaseReqVo.setData(users);
        return listBaseReqVo;
    }
}
