package com.application.ecommercecrud.Gateway;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.application.ecommercecrud.Gateway.api.FakeStoreProductAPI;
import com.application.ecommercecrud.dto.FakeStoreProductsResponseDTO;
import com.application.ecommercecrud.dto.ProductsDTO;

@Component
public class FakeStoreProductGateway implements IProductgateway {

    FakeStoreProductAPI fakeStoreProductAPI;

    public FakeStoreProductGateway(FakeStoreProductAPI fakeStoreProductAPI) {
        this.fakeStoreProductAPI = fakeStoreProductAPI;
    }

    @Override
    public List<ProductsDTO> getAllProducts() throws IOException {
        List<FakeStoreProductsResponseDTO> productsList = this.fakeStoreProductAPI.getAllFakeCategories().execute()
                .body();
        if (productsList == null) {
            throw new IOException("Failed to fetch product list from provided API");
        }
        return productsList.stream().map(product -> ProductsDTO.builder().productName(product.getTitle()).build())
                .toList();
    }

}
