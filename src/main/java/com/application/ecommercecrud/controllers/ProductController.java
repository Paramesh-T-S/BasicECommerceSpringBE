package com.application.ecommercecrud.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.ecommercecrud.dto.ProductsDTO;
import com.application.ecommercecrud.services.IProductService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    IProductService productService;

    public ProductController(@Qualifier("FakeStoreProductService1") IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("all")
    public List<ProductsDTO> getAllProducts() throws IOException {
        return this.productService.getAllProducts();
    }

}