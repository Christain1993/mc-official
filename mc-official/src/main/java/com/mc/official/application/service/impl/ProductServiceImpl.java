package com.mc.official.application.service.impl;

import com.mc.official.application.domain.Product;
import com.mc.official.application.mapper.ProductMapper;
import com.mc.official.application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Long save(Product product) {
        productMapper.insert(product);

        return product.getId();
    }

    @Override
    public void delete(Long id) {
        productMapper.deleteById(id);
    }
}
