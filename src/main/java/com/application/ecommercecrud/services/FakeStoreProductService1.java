package com.application.ecommercecrud.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.application.ecommercecrud.Gateway.IProductgateway;
import com.application.ecommercecrud.dto.ProductsDTO;

@Service("FakeStoreProductService1")
public class FakeStoreProductService1 implements IProductService {

    IProductgateway productgateway;

    public FakeStoreProductService1(IProductgateway productgateway) {
        this.productgateway = productgateway;
    }

    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        return this.productgateway.getAllProducts();
    }

}
