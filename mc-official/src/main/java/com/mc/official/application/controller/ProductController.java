package com.mc.official.application.controller;

import com.mc.official.application.domain.Product;
import com.mc.official.application.pojo.CommonResult;
import com.mc.official.application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/post")
    public CommonResult<Product> post(@RequestBody Product product) {
        Long id = productService.save(product);
        CommonResult commonResult = new CommonResult();
        commonResult.setData(id);

        return commonResult;
    }

    @RequestMapping("/post/name")
    public CommonResult<Product> postName(@RequestParam String name) {
        Product product = new Product();
        product.setProductName(name);

        Long id = productService.save(product);
        CommonResult commonResult = new CommonResult();
        commonResult.setData(id);

        return commonResult;
    }

    @RequestMapping( value = "/delete")
    public CommonResult<Integer> delete(@RequestParam Long id) {
        productService.delete(id);
        return new CommonResult<>();
    }
}
