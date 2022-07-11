package com.github.audience.common;

/**
 * @Author audience7510
 * @Date 2022/7/11
 * @ClassName ResultGenerator
 * @Description
 * @Version 1.0
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result success() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> success(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result fail(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }

    public static Result fail(ResultCode code,String message) {
        return new Result()
                .setCode(code)
                .setMessage(message);
    }
}
