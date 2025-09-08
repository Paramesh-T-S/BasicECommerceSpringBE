package com.application.ecommercecrud.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping("all")
    public List<String> getAllProducts() {
        return new ArrayList<>(Arrays.asList("Product1", "Product2", "Product3"));
    }

}