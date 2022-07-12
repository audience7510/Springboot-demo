package com.github.audience.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.audience.common.Result;
import com.github.audience.common.ResultGenerator;
import com.github.audience.entity.User;
import com.github.audience.service.UserService;
import com.github.audience.utils.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
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
    @Autowired
    private RedisUtils redisUtils;

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

    @GetMapping("getRedisByKey")
    @ApiOperation(value = "根据redis的key获取value")
    public Result getRedisByKey(@RequestParam String key) {
        Object object = redisUtils.get(key);
        return ResultGenerator.success(object);
    }

    @PostMapping("setRedisKeyAndValue")
    @ApiOperation(value = "插入redis key和value")
    public Result setRedisKeyAndValue(@RequestParam String key,@RequestParam String value) {
        boolean b = redisUtils.set(key, value);
        return ResultGenerator.success(b);
    }
}
