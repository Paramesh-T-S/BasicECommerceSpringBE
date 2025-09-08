package com.application.ecommercecrud.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements IProductService {

    @Override
    public List<String> getAllProducts() {
        return List.of("FakeProduct0", "FakeProduct1", "FakeProduct2");
    }

}
