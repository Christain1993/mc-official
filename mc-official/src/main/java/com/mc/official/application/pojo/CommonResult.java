package com.mc.official.application.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult<T> implements Serializable {

    private Integer code;

    private T data;

    private String msg;

}
