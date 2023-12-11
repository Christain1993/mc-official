package com.mc.official.application.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult<T> implements Serializable {

    private Integer code;

    private T data;

    private String msg;

    public CommonResult<T>  success() {
        return success("success");
    }

    public CommonResult<T> success(String message) {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(200);
        commonResult.setMsg(message);
        return commonResult;
    }
    public CommonResult<T> success(T data) {
        CommonResult<T> success = success();
        success.setData(data);
        return success;
    }

}
