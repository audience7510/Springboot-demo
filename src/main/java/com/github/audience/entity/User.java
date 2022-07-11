package com.github.audience.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author audience7510
 * @Date 2022/7/11
 * @ClassName User
 * @Description
 * @Version 1.0
 */
@Data
@ApiModel("用户实体类")
public class User {

    @ApiModelProperty(value = "ID")
    private Integer id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("昵称")
    private String nickName;
}
