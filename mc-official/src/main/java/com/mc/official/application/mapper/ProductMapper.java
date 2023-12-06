package com.mc.official.application.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mc.official.application.domain.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
