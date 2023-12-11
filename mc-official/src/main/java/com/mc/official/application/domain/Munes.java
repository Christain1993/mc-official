package com.mc.official.application.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Munes {

    private Long id;



    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long creator;
    private Long updater;
    private String remark;
}
