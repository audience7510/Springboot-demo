package com.github.audience.controller;

import com.github.audience.common.Result;
import com.github.audience.common.ResultGenerator;
import com.github.audience.entity.User;
import com.github.audience.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author audience7510
 * @Date 2022/7/11
 * @ClassName UserController
 * @Description
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser/{id}")
    @ApiOperation(value = "根据用户id查询用户信息")
    public Result getUser(@PathVariable String id) {
        User user = userService.getById(id);
        return ResultGenerator.success(user);
    }

    @PostMapping("updateUser")
    @ApiOperation(value = "更新用户信息")
    public Result updateUser(@RequestBody User user) {
        userService.updateById(user);
        return ResultGenerator.success();
    }
}
