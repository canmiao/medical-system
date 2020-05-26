package com.business.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 池灿淼
 * @date 2020/5/18
 * 前端通用的数据串
 **/
@Data
@AllArgsConstructor   //全参
@NoArgsConstructor    //空参
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
