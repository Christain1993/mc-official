package com.mc.official.application.service;

import com.mc.official.application.domain.Product;

public interface ProductService {
    Long save(Product product);

    void delete(Long id);
}
