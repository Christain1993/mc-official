package com.mc.official.application.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("products")
public class Product {
    @TableId
    private Long id;
    private String productName;
    private String keywords;
    private String material;
    private String standard;
    private String diameter;
    private String length;
    private String surface;
    private String technology;
    private String priceTerms;
    private String delivery;
    private String bigPhotos;
    private String detection;
    private String detectionPhotos;
    private String packingShipping;
    private String packingShippingPhotos;
    private String companyProfile;
    private String companyProfilePhotos;
    private String certificate;
    private String certificatePhotos;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Long creator;
    private Long updater;
    private String remark;

}
