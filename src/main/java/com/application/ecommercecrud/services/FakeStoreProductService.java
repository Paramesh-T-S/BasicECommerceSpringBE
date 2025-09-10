package com.application.ecommercecrud.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.application.ecommercecrud.Gateway.IProductgateway;
import com.application.ecommercecrud.dto.ProductsDTO;

@Service
public class FakeStoreProductService implements IProductService {

    IProductgateway productgateway;

    public FakeStoreProductService(IProductgateway productgateway) {
        this.productgateway = productgateway;
    }

    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        return this.productgateway.getAllProducts();
    }

}
