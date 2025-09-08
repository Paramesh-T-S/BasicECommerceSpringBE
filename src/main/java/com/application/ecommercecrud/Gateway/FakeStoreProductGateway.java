package com.application.ecommercecrud.Gateway;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FakeStoreProductGateway implements IProductgateway {

    @Override
    public List<String> getAllProducts() {
        return List.of("FakeProduct11", "FakeProduct1", "FakeProduct2");
    }

}
