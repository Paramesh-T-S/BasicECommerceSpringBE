package com.application.ecommercecrud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.ecommercecrud.Gateway.IProductgateway;

@Service
public class FakeStoreProductService implements IProductService {

    IProductgateway productgateway;

    public FakeStoreProductService(IProductgateway productgateway) {
        this.productgateway = productgateway;
    }

    @Override
    public List<String> getAllProducts() {
        return this.productgateway.getAllProducts();
    }

}
