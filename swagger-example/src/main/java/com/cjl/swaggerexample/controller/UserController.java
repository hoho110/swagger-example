package com.cjl.swaggerexample.controller;

import com.cjl.swaggerexample.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户模块 from javadoc
 */
@Api(value="用户模块 from swagger")
@RestController
public class UserController {

    //模拟数据库
    public static List<User> userList=new ArrayList<>();

    static{
        userList.add(new User(1,"张三","123456"));
        userList.add(new User(2,"李四","123456"));
    }

    /***
     * 获取单个用户 from javadoc
     * @param id ID
     * @param status 状态
     * @return 用户
     */
    @ApiOperation(value = "获取单个用户",notes="根据id查询用户")
    @ApiImplicitParam(value = "用户的id",paramType = "path")
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") @ApiParam("用户Id")int id, @RequestParam @ApiParam("状态")  String status){
        return userList.get(id);
    }

}
