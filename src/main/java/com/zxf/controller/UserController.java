package com.zxf.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zxf.entity.User;
import com.zxf.model.Result;
import com.zxf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:zxf
 * @create: 2023-01-30 09:54
 * @Description: 用户
 * @Company: 白云信科·研发中心·研发三室
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUserById")
    public User getUser(){
        return userService.getById(1);
    }

    @GetMapping("/getAllUser")
    public Result getAllUser(){
        List<User> list = userService.list();
        return Result.ok(list);
    }

    @GetMapping("/pageList")
    public Result<IPage<User>> pageList(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
                                        @RequestParam(value = "pageSize", defaultValue = "1") Integer pageSize){
        Page<User> page = new Page<>(pageIndex, pageSize);
        Page<User> list = (Page<User>) userService.page(page);
        return Result.ok(list);
    }

    /**
     * 模糊查询
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("/list")
    public Result<IPage<User>> list(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
                                    @RequestParam(value = "pageSize", defaultValue = "1") Integer pageSize,
                                    QueryParam<JSONObject> queryParam){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.likeRight("username", "马鸿");
        Page<User> page = new Page<>(pageIndex, pageSize);
        IPage<User> list = userService.page(page, qw);
        return Result.ok("操作成功！", list);
    }


}
