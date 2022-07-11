package com.github.audience.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.audience.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author audience7510
 * @Date 2022/7/11
 * @ClassName UserMapper
 * @Description
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
